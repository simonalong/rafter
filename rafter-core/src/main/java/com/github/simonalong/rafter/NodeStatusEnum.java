package com.github.simonalong.rafter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shizi
 * @since 2021-04-30 00:15:21
 */
@AllArgsConstructor
public enum NodeStatusEnum {

    /**
     * 跟随者
     */
    FOLLOWER("跟随者"),
    /**
     * 候选人
     */
    CANDIDATE("候选人"),
    /**
     * 领导者
     */
    LEADER("领导者");

    @Getter
    private final String desc;

    private static final Map<Integer, NodeStatusEnum> indexEnumMap;
    private static final Map<String, NodeStatusEnum> nameEnumMap;

    static {
        indexEnumMap = Arrays.stream(NodeStatusEnum.values()).collect(Collectors.toMap(NodeStatusEnum::ordinal, e -> e));
        nameEnumMap = Arrays.stream(NodeStatusEnum.values()).collect(Collectors.toMap(NodeStatusEnum::name, e -> e));
    }

    public static NodeStatusEnum parse(Integer index) {
        if (!indexEnumMap.containsKey(index)) {
            throw new RuntimeException("不支持下标: " + index);
        }
        return indexEnumMap.get(index);
    }

    public static NodeStatusEnum parse(String name) {
        if (!nameEnumMap.containsKey(name)) {
            throw new RuntimeException("不支持name: " + name);
        }
        return nameEnumMap.get(name);
    }
}
