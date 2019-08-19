package com.gfg.practice.avinash.array;

public class MaxSumInSubArrayOfK {

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,8}; // k= 2

        int [] arr2 = {3,8,2,10,15,-1,40}; // k= 3

        System.out.println(max(arr2, arr2.length, 3));
    }

    static int max(int[] arr, int n, int k){
        int i = 0;
        int max = -1;
        int sum = 0;

        for(;i<k;i++){
            sum += arr[i];
        }

        for(;i<n;i++){
            sum -= arr[i-k];

            sum += arr[i];

            if(sum>max)
                max = sum;
        }

        return max;
    }
}
