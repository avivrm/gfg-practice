package com.gfg.practice.avinash.recusrsion;


/* TODO:: not working */

public class BinaryCombinationOfDecimal {

    public static void main(String[] args) {
        int[] arr = new int[5];
        f(arr,0,2 );
    }

    static void f(int arr[], int i, int n){
        if(i==n) {
            for(int val : arr)
                System.out.print(val + " ");
            return;
        }

        arr[i] = 0;
        f(arr,i+1,n);
        arr[i] = 1;
        f(arr, i+1,n);
    }
}
