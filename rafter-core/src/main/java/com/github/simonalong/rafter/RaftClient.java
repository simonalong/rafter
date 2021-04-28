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

    private String region;
    private String namespace;

    public void addConnect(String... urls) {

    }

    public Boolean put(String key, String value) {

    }

    public String get(String key) {

    }

    public Boolean delete(String key) {

    }

    public List<String> keys() {

    }

    public List<String> keys(String keyPre) {

    }

    public void watch(String key, BiConsumer<EventEnum, String> callback) {

    }
}
