package com.github.simonalong.rafter;

import com.github.simonalong.rafter.controller.*;
import com.simonalong.glue.GlueClient;
import com.simonalong.glue.GlueServer;

/**
 * 采用状态模式来处理
 *
 * @author shizi
 * @since 2021-04-30 00:14:58
 */
public class Node {

    private static final Node INSTANCE = new Node();

    /**
     * 节点角色
     */
    private NodeRoleEnum nodeStatus = NodeRoleEnum.FOLLOWER;
    /**
     * 节点任期
     */
    private Long term = 0L;
    private final GlueServer server = GlueServer.getInstance();
    private final GlueClient client = GlueClient.getInstance();

    private Node(){}

    public static Node getInstance() {
        return INSTANCE;
    }

    public void addConnect(String... urls) {
        for (String url : urls) {
            client.addConnect(url);
        }
    }

    public void bind(Integer port) {
        server.bind("127.0.0.1:" + port);
    }

    public void changeStatus(NodeRoleEnum nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    /**
     * 接收到心跳
     */
    public void receiveHeart() {
        // todo
    }

    /**
     * 接收到投票
     */
    public void receiveElection() {
        // todo
    }

    /**
     * 接收到称王
     */
    public void receiveBeKing() {
        // todo
    }

    /**
     * 接收到数据预写入
     */
    public void receiveDataPreWrite() {
        // todo
    }

    /**
     * 接收到数据写入确认
     */
    public void receiveDataWriteCommitted() {
        // todo
    }

    public void sendHeart() {
        // todo
    }

    public void sendElection() {
        // todo
    }

    public void sendBeKing() {
        // todo
    }

    public void sendPreWrite() {
        // todo
    }

    public void sendWriteConfirm() {
        // todo
    }

    public void start(){
        server.addController(ServerController.class);
        server.addController(ServerOfHeartController.class);
        server.addController(ServerOfElectionController.class);
        server.start();

        client.addController(ClientController.class);
        client.addController(ClientOfHeartController.class);
        client.addController(ClientOfElectionController.class);
        client.start();


    }
}
