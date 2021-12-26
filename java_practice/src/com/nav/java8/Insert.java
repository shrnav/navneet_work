package com.nav.java8;

public class Insert {

    public static void main(String arr[]){

        int intArr [] = new int[]{1,2,3,4,5};
        int pos= 1;
        //int finalArr[] = insertInto(intArr,11,pos);
        //for (int i = 0; i <finalArr.length ; i++) {
          //  System.out.println(finalArr[i]+" ");
        //}

        int delPos = 2;
        int finalArrAfterDelete[] = delte(intArr,delPos);
        for (int i = 0; i <finalArrAfterDelete.length ; i++) {
            System.out.println(finalArrAfterDelete[i]+" ");
        }
    }

    private static int[] delte(int[] intArr, int delPos) {
        int finalArr [] = new int[4];
        for (int i = 0; i <intArr.length ; i++) {
            if(i==delPos-1){

                intArr[i] = intArr[i+1];
                i++;
               // i=delPos-1;
break;
                //i--;
            }

        }
        finalArr = intArr;
        return finalArr;

    }

    private static int[] insertInto(int[] intArr, int n, int pos) {
        //intArr =  new int[];
        System.out.println("Before Inserting");
        for (int i = 0; i <intArr.length ; i++) {
            System.out.println(intArr[i]+" ");
        }
        System.out.println("After Inserting");
        int newArr[]= new int[6];
        for (int i = 0; i <newArr.length ; i++) {
            if (i < pos - 1)
                newArr[i] = intArr[i];
            else if (i == pos - 1)
                newArr[i] = n;
            else
                newArr[i] = intArr[i - 1];
        }
        return newArr;
    }
}
