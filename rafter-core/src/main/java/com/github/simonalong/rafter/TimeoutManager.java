package com.github.simonalong.rafter;

import javafx.concurrent.ScheduledService;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/**
 * 超时管理器：管理两个超时，一个是心跳超时，一个是选举超时
 *
 * @author shizi
 * @since 2021-04-30 00:44:35
 */
public class TimeoutManager {

    private ScheduledExecutorService scheduledExecutorService;
    private ScheduledFuture electionScheduledFuture;
    private ScheduledFuture heartbeatScheduledFuture;

    /**
     * 重置心跳
     */
    public void resetHeartbeat() {

    }

    /**
     * 停止心跳
     */
    public void stopHeartbeat() {

    }

    /**
     * 重置选举
     */
    public void resetElection() {

    }

    /**
     * 停止选举
     */
    public void stopElection() {

    }
}
