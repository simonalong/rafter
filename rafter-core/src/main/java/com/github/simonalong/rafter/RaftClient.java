package com.github.simonalong.rafter;

import lombok.Data;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * @author shizi
 * @since 2021-04-29 00:19:17
 */
@Data
public class RaftClient {

    private final Node node = Node.getInstance();
    private String region;
    private String namespace;

    public void addConnect(String... urls) {
        node.addConnect(urls);
    }

    public Boolean put(String key, String value) {
        // todo
        return true;
    }

    public String get(String key) {
        // todo
        return null;
    }

    public Boolean delete(String key) {
        // todo
        return null;
    }

    public List<String> keys() {
        // todo
        return null;
    }

    public List<String> keys(String keyPre) {
        // todo
        return null;
    }

    public void watch(String key, BiConsumer<EventEnum, String> callback) {
        // todo
    }
}
