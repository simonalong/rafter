package com.github.simonalong.rafter.controller;

import com.github.simonalong.rafter.pojo.BeKingReq;
import com.github.simonalong.rafter.pojo.BeKingRsp;
import com.github.simonalong.rafter.pojo.VoteReq;
import com.github.simonalong.rafter.pojo.VoteRsp;
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
    @CommandMapping(request = "vote", response = "voteRsp")
    public VoteRsp election(VoteReq voteReq) {
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
