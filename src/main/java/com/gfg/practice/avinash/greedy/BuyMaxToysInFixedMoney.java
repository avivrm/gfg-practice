package com.gfg.practice.avinash.greedy;

import java.util.Arrays;

public class BuyMaxToysInFixedMoney {
    public static void main(String[] args) {
        int[] arr = {7,9,13,30,2,4};
        int rupee = 35;
        System.out.println(String.format("Max toys %d can be bought within %d rupess", getMaxElement(arr, arr.length, rupee) ,rupee));
    }

    static int getMaxElement(int[] arr, int n, int rupee){
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;

        for(int i = 0; i<n; i++){
            if ((arr[i] + sum) <= rupee) {
                sum += arr[i];
                count += 1;
            }else{
                break;
            }
        }
        return count;
    }
}
