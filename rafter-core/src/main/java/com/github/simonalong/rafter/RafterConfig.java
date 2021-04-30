package com.github.simonalong.rafter;

import lombok.Data;

import static com.github.simonalong.rafter.RafterConstants.DEFAULT_HEART_BEAT_TIMEOUT;

/**
 * @author shizi
 * @since 2021-04-30 13:45:28
 */
@Data
public class RafterConfig {

    /**
     * 心跳时长，单位毫秒，默认：3秒
     */
    private Integer heartBeatTime = DEFAULT_HEART_BEAT_TIMEOUT;
}
