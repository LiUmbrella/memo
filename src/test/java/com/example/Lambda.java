package com.example;

import java.util.*;

/**
 * TODO
 *
 * @author lixiang
 * @since 2019年09月11日 17:52
 */
public class Lambda {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        ArrayList<String> objects = new ArrayList<>();
        objects.add("wasdfads");
        map.put("1",objects);

        List<String> strings = map.getOrDefault("3", Collections.emptyList());
        strings.stream().findFirst();
        // Collections.emptyList().stream().collect()
    }
}
