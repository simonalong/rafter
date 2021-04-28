package com.github.simonalong.rafter;

import com.github.simonalong.rafter.controller.ClientOfLeaderController;
import com.github.simonalong.rafter.controller.ServerOfCandidateController;
import com.github.simonalong.rafter.controller.ServerOfFollowerController;
import com.github.simonalong.rafter.controller.ServerOfLeaderController;
import com.simonalong.glue.GlueClient;
import com.simonalong.glue.GlueServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        server.addController(ServerOfLeaderController.class);
        server.addController(ServerOfCandidateController.class);
        server.addController(ServerOfFollowerController.class);
        server.start();

        client.addController(ClientOfLeaderController.class);
        client.addController(ServerOfCandidateController.class);
        client.addController(ServerOfFollowerController.class);
        client.start();
    }
}
