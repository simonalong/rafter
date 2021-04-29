package com.github.simonalong.rafter.controller;

import com.github.simonalong.rafter.pojo.HeartReq;
import com.github.simonalong.rafter.pojo.HeartRsp;
import com.simonalong.glue.annotation.CommandMapping;
import com.simonalong.glue.annotation.GlueController;

/**
 * @author shizi
 * @since 2021-04-29 18:15:51
 */
@GlueController(group = "heart", executor = "single")
public class ServerOfHeartController {

    @CommandMapping(request = "ping", response = "pong")
    public HeartRsp getHeart(HeartReq heartReq) {

    }
}
