package com.gfg.practice.array;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr= {1,2,4,5,6,7};

        rotateArray(arr);

        for (int val:arr)
            System.out.println(val);

    }


    static void rotateArray(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
