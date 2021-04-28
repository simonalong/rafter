package com.github.simonalong.rafter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shizi
 * @since 2021-04-29 00:31:23
 */
@AllArgsConstructor
public enum EventEnum {

    /**
     * 添加或者更新
     */
    PUT("添加或者更新"),
    /**
     * 获取
     */
    GET("获取"),
    /**
     * 删除
     */
    DELETE("删除");

    @Getter
    private final String desc;

    private static final Map<Integer, EventEnum> indexEnumMap;
    private static final Map<String, EventEnum> nameEnumMap;

    static {
        indexEnumMap = Arrays.stream(EventEnum.values()).collect(Collectors.toMap(EventEnum::ordinal, e -> e));
        nameEnumMap = Arrays.stream(EventEnum.values()).collect(Collectors.toMap(EventEnum::name, e -> e));
    }

    public static EventEnum parse(Integer index) {
        if (!indexEnumMap.containsKey(index)) {
            throw new RuntimeException("不支持下标: " + index);
        }
        return indexEnumMap.get(index);
    }

    public static EventEnum parse(String name) {
        if (!nameEnumMap.containsKey(name)) {
            throw new RuntimeException("不支持name: " + name);
        }
        return nameEnumMap.get(name);
    }
}
