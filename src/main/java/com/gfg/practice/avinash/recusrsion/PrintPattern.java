package com.gfg.practice.recusrsion;

public class PrintPattern {

    public static void main(String[] args) {

        printPattern(5, 1);
    }


    public static void printPattern(int n, int i){

        if(n < 1)
            return;

        if(n>=i){
            System.out.print("*");
            printPattern(n, i+1);
        }else{

            System.out.println("");
            printPattern(n-1,1);
        }

    }
}
