package com.gfg.practice.array;

import java.util.Arrays;

public class ArrivalDeparture {

    public static void main(String[] args) {
        int arr1[] = {300,600,410,330};
        int arr2[] = {400,900,450,630};

        int[] arr3 = {900, 940, 950, 1100, 1500, 1800};
        int[] arr4 = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(getMax(arr3, arr4, arr1.length));
    }

    static int getMax(int[] arr1,int[] arr2, int n){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int max = 0;

        int i ; int j;
        i = j =0;
        while(i<n && j<n){
            if(arr1[i] < arr2[j]){
                max +=1;
                i++;
            }else{
                max -=1;
                j++;
            }
        }

        return max;
    }
}
