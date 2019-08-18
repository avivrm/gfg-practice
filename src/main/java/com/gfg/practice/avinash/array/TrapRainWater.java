package com.gfg.practice.array;

// trap water

// find sqrt

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// guess the number
public class TrapRainWater {

    public static void main(String[] args) {

        int[] arr =  {3, 0, 0, 2, 0, 4};

        System.out.println(totalWater(arr, arr.length));
    }

    static int totalWater(int[] arr, int n){
        int l = 0;
        int h = arr.length-1;
        int result = 0;
        int leftMax = 0;
        int rightMax = 0;


        while(l<=h){
            if(arr[l]<arr[h]){
                if(arr[l] > leftMax)
                    leftMax = arr[l];
                else{
                    result += leftMax - arr[l];
                }
                l++;
            }else{
                if(arr[h] > rightMax)
                    rightMax = arr[h];
                else
                    result+= rightMax - arr[h];

                h--;
            }
        }

        return result;
    }

}
