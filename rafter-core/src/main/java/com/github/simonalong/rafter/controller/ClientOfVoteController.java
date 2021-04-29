package com.github.simonalong.rafter.controller;

import com.github.simonalong.rafter.pojo.BeKingRsp;
import com.github.simonalong.rafter.pojo.ElectionRsp;
import com.simonalong.glue.annotation.CommandMapping;
import com.simonalong.glue.annotation.GlueController;

/**
 * @author shizi
 * @since 2021-04-29 23:58:46
 */
@GlueController(group = "election", executor = "cache")
public class ClientOfElectionController {

    @CommandMapping(request = "voteResult")
    public void voteResult(ElectionRsp voteRsp) {
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
