package com.github.simonalong.rafter.controller;

import com.github.simonalong.rafter.pojo.HeartReq;
import com.github.simonalong.rafter.pojo.HeartRsp;
import com.simonalong.glue.annotation.CommandMapping;
import com.simonalong.glue.annotation.GlueController;

/**
 * @author shizi
 * @since 2021-04-29 18:13:46
 */
@GlueController(executor = "cache")
public class ServerController {


    /**
     * 写未提交
     * @param heartReq
     * @return
     */
    @CommandMapping(request = "preWrite", response = "preWriteRsp")
    public PreWriteRsp preWrite(PreWriteReq preWriteReq) {

    }

    /**
     * 写入确认
     * @param heartReq
     * @return
     */
    @CommandMapping(request = "writeConfirm", response = "writeConfirmRsp")
    public WriteConfirmRsp writeConfirm(WriteConfirmReq writeConfirmReq) {

    }

}
