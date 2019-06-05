package com.gfg.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintNegetivePositivePair {

    public static void main(String[] args) {


        int[] arr = {-241, 76, 137, -594, -367, -234, 817, -438, -401 };

        printPair(arr, arr.length);
    }

    static void printPair(int arr[], int n){

        Arrays.sort(arr);

        Set<Integer> s = new HashSet<Integer>();

        for(int i=0;i<n;i++){
            int val = arr[i];
            if(val<0){
                val  = -1 * val;
            }
            if(s.contains(val)){
                System.out.print(-1*val + " " + val + " ");
            }else{
                s.add(val);
            }
        }
        if(s.size() == n)
            System.out.println(-1);
        else
        System.out.println("");

    }

}
