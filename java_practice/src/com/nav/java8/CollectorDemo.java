package com.nav.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorDemo {
static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            integerList.add(i);
        }

        Stream<Integer> stream = integerList.stream().filter(p->p%2==0).collect(Collectors.toList()).stream();
        stream.forEach(i-> System.out.println(i));

    }
}
