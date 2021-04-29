package com.github.simonalong.rafter.controller;

import com.github.simonalong.rafter.pojo.BeKingRsp;
import com.github.simonalong.rafter.pojo.VoteRsp;
import com.simonalong.glue.annotation.CommandMapping;
import com.simonalong.glue.annotation.GlueController;

/**
 * @author shizi
 * @since 2021-04-29 23:58:46
 */
@GlueController(group = "vote", executor = "cache")
public class ClientOfVoteController {

    @CommandMapping(request = "voteResult")
    public void voteResult(VoteRsp voteRsp) {
        // todo
    }

    /**
     * 称王返回结果
     * @return
     */
    @CommandMapping(request = "beKingRsp")
    public void beKingRsp(BeKingRsp beKingRsp) {
        // todo
    }
}
