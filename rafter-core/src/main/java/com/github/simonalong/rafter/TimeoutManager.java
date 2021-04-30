package com.github.simonalong.rafter;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 超时管理器：管理两个超时，一个是心跳超时，一个是选举超时
 *
 * @author shizi
 * @since 2021-04-30 00:44:35
 */
public class TimeoutManager {

    private Node currentNode = Node.getInstance();
    private RafterConfig rafterConfig;
    private ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(2);
    private ScheduledFuture electionScheduledFuture;
    private ScheduledFuture heartbeatScheduledFuture;

    /**
     * 重置心跳
     */
    public void resetHeartbeat() {
        if (null != electionScheduledFuture && !electionScheduledFuture.isDone()) {
            electionScheduledFuture.cancel(true);
        }

        // 延迟固定时间，后发送心跳
        electionScheduledFuture = scheduledExecutorService.schedule(this::sendHeartBeat, rafterConfig.getHeartBeatTime(), TimeUnit.SECONDS);
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

    /**
     * 发送心跳
     */
    private void sendHeartBeat() {
        currentNode.sendHeart();
    }
}
