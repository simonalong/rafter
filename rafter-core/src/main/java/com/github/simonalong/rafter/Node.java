package com.github.simonalong.rafter;

/**
 * @author shizi
 * @since 2021-04-30 00:14:58
 */
public class Node {

    private NodeStatusEnum nodeStatus;

    /**
     * 接收到心跳
     */
    public void receiveHeart() {

    }

    /**
     * 接收到投票
     */
    public void receiveVote() {

    }

    /**
     * 接收到称王
     */
    public void receiveBeKing() {

    }

    /**
     * 接收到数据预写入
     */
    public void receiveDataPreWrite() {

    }

    /**
     * 接收到数据写入确认
     */
    public void receiveDataWriteCommitted() {

    }

    public void sendHeart() {

    }

    public void sendVote() {

    }

    public void sendBeKing() {

    }

    public void sendPreWrite() {

    }

    public void sendWriteConfirm() {

    }
}
