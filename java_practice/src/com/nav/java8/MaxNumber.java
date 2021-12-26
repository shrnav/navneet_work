package com.nav.java8;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNumber {
    public static void main(String[] args) {
        int arr[] = {22,11,3,5,56,23};
         int a = Arrays.stream(arr).max().getAsInt();
        System.out.println(a);

    }

//    class FindMax implements Comparator<Integer>{
//
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return 0;
//        }
//    }
}
