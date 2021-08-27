package com.test.array;

public class IntegerPalindroms {

    public static void main(String[] args) {
        System.out.println(isPalindrom(1222222221));
    }
    private static boolean isPalindrom(int number){
        StringBuilder string = new StringBuilder();
        String a = null;
        int orig = number;
        int x;
        int y=0;
        String z="";
        String xString="";
        if(number>=0 && number<10 ){
            return true;
        }else if(number>=10){
            for (int i = 0; i <(""+orig).length() ; i++) {
                y = number/10;
                x = number%10;
                number = y;
                xString = x+"";
                z =  z.concat(xString);
            }
            int finalString = Integer.parseInt(z);
            System.out.println(finalString);
            System.out.println(orig);
            if(finalString == orig){
                return true;
            }
        }
        return false;
    }
}

