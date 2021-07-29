package com.nav.java8;

import java.util.List;
import java.util.stream.Collectors;

public class SearchString {
    public static List<String> getStartsWithName(String key, List<String> list) {
        return list.stream().filter(s -> s.toLowerCase().startsWith(key)).collect(Collectors.toList());//forEach(System.out::println);
    }
}
