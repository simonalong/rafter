package com.github.simonalong.rafter.controller;

import com.simonalong.glue.annotation.CommandMapping;
import com.simonalong.glue.annotation.GlueController;

/**
 * @author shizi
 * @since 2021-04-29 18:14:15
 */
@GlueController(executor = "single")
public class ClientController {

    /**
     * 预写入返回
     * @return
     */
    @CommandMapping(request = "preWriteRsp")
    public void getHeart(PreWriteRsp preWriteRsp) {

    }

    /**
     * 写提交返回值
     * @return
     */
    @CommandMapping(request = "writeConfirmRsp")
    public void writeCommittedRsp(WriteConfirmRsp writeConfirmRsp) {

    }
}
