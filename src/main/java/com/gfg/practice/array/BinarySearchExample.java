package com.gfg.practice.array;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8};

        System.out.println(getIndex(arr,0,arr.length-1, 9));
    }


    static int getIndex(int[] arr, int l, int h, int val){
        if(l>h)
            return -1;

        int mid = (l+h)/2;

        if(arr[mid] == val)
            return mid;

        if(val > arr[mid]){
            return getIndex(arr, mid+1, h, val);

        }else{
            return getIndex(arr, l, mid, val);

        }

    }
}
