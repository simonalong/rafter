package com.github.simonalong.rafter.controller;

import com.github.simonalong.rafter.pojo.HeartRsp;
import com.simonalong.glue.annotation.CommandMapping;
import com.simonalong.glue.annotation.GlueController;

/**
 * @author shizi
 * @since 2021-04-29 18:16:19
 */
@GlueController(group = "heart", executor = "single")
public class ClientOfHeartController {

    @CommandMapping(request = "ping")
    public void getHeart(HeartRsp heartRsp) {
        // todo
    }
}
