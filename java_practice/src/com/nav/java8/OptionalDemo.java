package com.nav.java8;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";

        Optional<String> optionalValue = Optional.of(str[5]);
        if(optionalValue.isPresent()){
            System.out.println(str[5].toLowerCase());
        }
        else
        {
            System.out.println("Value is empty");
        }
    }


}
