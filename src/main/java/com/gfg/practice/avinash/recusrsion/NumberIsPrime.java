package com.gfg.practice.avinash.recusrsion;

public class NumberIsPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(13,2));
    }

    static boolean isPrime(int n, int i){
        if(n<=2)
            return n==2 ? true:false;

        if(n%i == 0)
            return false;
        if(i*i>n)
            return true;

        return isPrime(n, i+1);
    }
}
