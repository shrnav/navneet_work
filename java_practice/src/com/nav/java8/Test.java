package com.nav.java8;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
//        StringJoiner stj = new StringJoiner(",","{","}");
//        stj.add("Saket");
//        stj.add("John");
//        stj.add("Franklin");
//        stj.add("Ricky");
//        stj.add("Trevor");
//        System.out.println(stj);
//
//        Stream<Integer> stream = Stream.iterate(2,count->count+1).filter(i->i%2==0).limit(5);//.forEach(System.out::println);
//        List<Integer> list  = stream.collect(Collectors.toList());
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//        int [] array = {4,1,3,2,5};
//        Arrays.sort(array);
//        Arrays.stream(array).forEach(System.out::print);
//        List<String> list = new ArrayList<String>();
//        list.add("Saket");
//        list.add("Saurav");
//        list.add("abc");
//        list.add("abcd");
//        list.add("Softwaretestinghelp");
//        list.add("Steve");
//
//        long count = list.stream().filter(s->s.length()>5).count();
//        System.out.println(count);

        int arr[] = {2,1,1,3,4,11,23,10};
        Stream.of(arr).collect(Collectors.toList()).forEach(System.out::println);
        //Set<int[]> collect = Arrays.asList(arr).stream().collect(Collectors.toSet());

    }
}
