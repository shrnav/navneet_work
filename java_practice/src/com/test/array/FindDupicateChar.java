package com.test.array;

public class FindDupicateChar {

    static String str = "Better Butter";

    public static void main(String[] args) {
        findDuplicate(str);
    }

    public static void findDuplicate(String str)
    {
      StringBuilder sbuulder = new StringBuilder(str);

      char[] charArr = str.toCharArray();
      int count =0;
      int i=0;
      while(i<charArr.length) {
          for (int j = 0; j < charArr.length; j++) {
              if (charArr[i] == charArr[j]) {
                  count++;
              }

          }
          System.out.println(charArr[i]+"  "+count);
          i++;
          count = 0;
      }
    }
}
