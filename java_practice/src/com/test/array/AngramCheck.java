package com.test.array;

import java.util.Arrays;

public class AngramCheck {

    public static void main(String[] args) {
        String str1 = "Mother In Law";
        String str2 = "Hitler Woman";

        str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        char []str1Array = str1.toCharArray();
        char []str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        String sortStr1 =  new String(str1Array);
        Arrays.sort(str2Array);
        String sortStr2 =  new String(str2Array);
        System.out.println(sortStr1);
        System.out.println(sortStr2);
        if(sortStr1.length()==sortStr2.length())
        {
           if(sortStr1.equals(sortStr2))
           {
               System.out.println("Strings are angrams");
           }
           else
           {
               System.out.println("Strings are not angrams");
           }

        }
        else
        {
            System.out.println("Strings are not angrams");
        }
    }


}
