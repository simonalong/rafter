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
public enum NodeRoleEnum {

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

    private static final Map<Integer, NodeRoleEnum> indexEnumMap;
    private static final Map<String, NodeRoleEnum> nameEnumMap;

    static {
        indexEnumMap = Arrays.stream(NodeRoleEnum.values()).collect(Collectors.toMap(NodeRoleEnum::ordinal, e -> e));
        nameEnumMap = Arrays.stream(NodeRoleEnum.values()).collect(Collectors.toMap(NodeRoleEnum::name, e -> e));
    }

    public static NodeRoleEnum parse(Integer index) {
        if (!indexEnumMap.containsKey(index)) {
            throw new RuntimeException("不支持下标: " + index);
        }
        return indexEnumMap.get(index);
    }

    public static NodeRoleEnum parse(String name) {
        if (!nameEnumMap.containsKey(name)) {
            throw new RuntimeException("不支持name: " + name);
        }
        return nameEnumMap.get(name);
    }
}
