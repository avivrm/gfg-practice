package com.gfg.practice.array;

import java.util.Arrays;

public class DistibuteChoclate {

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56}; // op 2
        int students = 3;
        int[] arr1 = {3, 4, 1, 9, 56, 7, 9, 12}; // op 6
        int students1 = 5;
        int[] arr2 = {12, 4, 7, 9, 2, 23, 25, 41,
                30, 40, 28, 42, 30, 44, 48,
                43, 50};                            // op 10
        int students2 = 7;
        System.out.println(String.format("Min diff between the choclate packet is %d", getMinDiffVal(arr1, arr1.length, students1)));
    }

    static int getMinDiffVal(int[] arr, int n, int s){
        Arrays.sort(arr);
        int diff = -1;
        int minDiff = Integer.MAX_VALUE;
        int i= 0;
        for(;i<s;i++)
        {
            diff = arr[s-1] - arr[0];
        }
        if(diff < minDiff)
            minDiff = diff;

        for(;i<n;i++){
            diff = arr[i] - arr[i-s+1];
            if(diff < minDiff)
                minDiff = diff;

        }
        return minDiff;
    }
}
