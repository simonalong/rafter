package com.github.simonalong.rafter;

import org.junit.Test;

/**
 * @author shizi
 * @since 2021-04-21 16:56:22
 */
public class RafterTest {

    @Test
    public void server1Test() {
        RafterServer server = new RafterServer("localhost:8082", "localhost:8083");
        server.bind(8081);
        server.start();
    }

    @Test
    public void server2Test() {
        RafterServer server = new RafterServer("localhost:8081", "localhost:8083");
        server.bind(8082);
        server.start();
    }

    @Test
    public void server3Test() {
        RafterServer server = new RafterServer("localhost:8081", "localhost:8082");
        server.bind(8083);
        server.start();
    }

    @Test
    public void server4Test() {
        RafterServer server = new RafterServer().addPeerNode("localhost:8081", "localhost:8082");
        server.bind(8084);
        server.start();
    }

    @Test
    public void clientPutTest() {
        RaftClient client = new RaftClient();
        client.setRegion("default");
        client.setNamespace("default");
        client.addConnect("localhost:8081", "localhost:8082");
        client.put("/k1/k2/k3/k4", "test");
    }

    @Test
    public void clientGetTest() {
        RaftClient client = new RaftClient();
        client.addConnect("localhost:8081", "localhost:8082");
        client.put("/k1/k2/k3/k4", "test");
        client.get("/k1/k2/k3/k4");
    }

    @Test
    public void clientDeleteTest() {
        RaftClient client = new RaftClient();
        client.addConnect("localhost:8081", "localhost:8082");
        client.put("/k1/k2/k3/k4", "test");
        client.get("/k1/k2/k3/k4");
        client.delete("/k1/k2/k3/k4");
        client.get("/k1/k2/k3/k4");
    }

    @Test
    public void clientKeys1Test() {
        RaftClient client = new RaftClient();
        client.addConnect("localhost:8081", "localhost:8082");
        client.put("/k1/k2/k3/k1", "test");
        client.put("/k1/k2/k3/k2", "test");
        client.put("/k1/k2/k3/k3", "test");
        client.put("/k1/k2/k3/k4", "test");
        client.keys();
    }

    @Test
    public void clientKeys2Test() {
        RaftClient client = new RaftClient();
        client.addConnect("localhost:8081", "localhost:8082");
        client.put("/k1/k2/k3/k1", "test");
        client.put("/k1/k2/k3/k2", "test");
        client.put("/k1/k2/k3/k3", "test");
        client.put("/k1/k2/k3/k4", "test");
        client.keys("/k1/k2/k3");
    }

    @Test
    public void clientWatchTest() {
        RaftClient client = new RaftClient();
        client.addConnect("localhost:8081", "localhost:8082");
        client.put("/k1/k2/k3/k4", "test");
        client.watch("/k1/k2/k3/k4", (eventEnum, value) -> {
            System.out.println("收到回调: " + value);
        });
        client.put("/k1/k2/k3/k4", "test12");
    }
}
