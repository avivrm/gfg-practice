package com.gfg.practice.avinash.array;
// kadane's algo
public class LargestContigousSum {

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(sum(arr, arr.length));
    }

    static int sum(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
