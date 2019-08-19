package com.gfg.practice.avinash.recusrsion;

public class PrintSerialAndReverseNumber {

    public static void main(String[] args) {

        print1ToN(4);

        System.out.println("**********************");

        printNTo1(4);

    }

    static void print1ToN(int n){
        if(n==0)
            return;
        print1ToN(n-1);
        System.out.println(n);
    }

    static void printNTo1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNTo1(n-1);
    }
}
