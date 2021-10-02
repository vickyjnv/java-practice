package com.company;

public class GlobalLocal {


    public static void main(String[] args) {
        int a=4;
        System.out.println(a);
        Display();
    }

    public static void Display(){
        int a=45;
        System.out.println("Local "+ a);
    }
    //there is no scope of global variable in java

}
