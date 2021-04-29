package com.github.simonalong.rafter.controller;

import com.github.simonalong.rafter.pojo.BeKingReq;
import com.github.simonalong.rafter.pojo.BeKingRsp;
import com.github.simonalong.rafter.pojo.ElectionReq;
import com.github.simonalong.rafter.pojo.ElectionRsp;
import com.simonalong.glue.annotation.CommandMapping;
import com.simonalong.glue.annotation.GlueController;

/**
 * @author shizi
 * @since 2021-04-29 18:20:16
 */
@GlueController(group = "election", executor = "single")
public class ServerOfElectionController {

    /**
     * 拉票请求
     * @param voteReq
     * @return
     */
    @CommandMapping(request = "election", response = "voteRsp")
    public ElectionRsp election(ElectionReq voteReq) {
        // todo
    }

    /**
     * 称王
     * @param voteReq
     * @return
     */
    @CommandMapping(request = "beKing", response = "beKingRsp")
    public BeKingRsp beKing(BeKingReq beKingReq) {
        // todo
    }
}
