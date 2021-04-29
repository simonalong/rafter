package com.github.simonalong.rafter;

import com.github.simonalong.rafter.controller.*;
import com.simonalong.glue.GlueClient;
import com.simonalong.glue.GlueServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/**
 * @author shizi
 * @since 2021-04-29 00:19:07
 */
public class RafterServer {

    private GlueServer server = GlueServer.getInstance();
    private GlueClient client = GlueClient.getInstance();
    private final List<String> urlList = new ArrayList<String>();
    private Integer port;

    public RafterServer(String... urls) {
        urlList.addAll(Arrays.asList(urls));
        for (String url : urls) {
            client.addConnect(url);
        }
    }

    public RafterServer addConnect(String... urls) {
        urlList.addAll(Arrays.asList(urls));
        return this;
    }

    public void bind(int port) {
        this.port = port;
    }

    public void start() {
        server.addController(ServerController.class);
        server.addController(ServerOfHeartController.class);
        server.addController(ServerOfVoteController.class);
        server.start();

        client.addController(ClientController.class);
        client.addController(ClientOfHeartController.class);
        client.addController(ClientOfVoteController.class);
        client.start();
    }

    public void addCallOfPut(Function<String, String> callOfPut) {

    }

    public void addCallOfGet(Function<String, String> callOfGet) {

    }

    public void addCallOfDelete(Function<String, String> callOfDelete) {

    }

    public void addCallOfKeys(Callable<List<String>> callOfKeys) {

    }

    public void addCallOfKeys(Function<String, List<String>> callOfKeys) {

    }
}
