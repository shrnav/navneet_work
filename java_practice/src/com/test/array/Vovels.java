package com.test.array;

public class Vovels {
    public static void main(String[] args) {
        checkVovels("How many vowels in this String");
    }

    public static void checkVovels(String str) {

        char[] charArray = str.toCharArray();
        int count=0;
        for (char c: charArray  ) {

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                }
            }
        System.out.println(count);
        }


    }

