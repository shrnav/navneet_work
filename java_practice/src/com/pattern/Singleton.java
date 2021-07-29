package com.pattern;

import java.lang.reflect.Constructor;

public class Singleton {

    private static Singleton singleton = null;

    //Private Constructor
    private Singleton() {
        System.out.println("Creating..");
    }

    //Global access point
    public static Singleton getInstance() {
        if(null==singleton)
        singleton = new Singleton();
        return singleton;
    }

}
class TestClass {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        print("s1",s1);
        print("s2",s2);

            Class clazz = Class.forName("pattern.Singleton");
           // Constructor<Singleton> ctor = clazz.getDeclaredConstructor().getN
           Constructor[] cons = clazz.getDeclaredConstructors();
           cons[0].setAccessible(true);
           Singleton s3 =  (Singleton)cons[0].newInstance();
           print("s3",s3);




    }

    private static void print(String str,Singleton object){
        System.out.println(String.format("Object : %s, Hashcode : %d", str,object.hashCode()));
    }

    }

