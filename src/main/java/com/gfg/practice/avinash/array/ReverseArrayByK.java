package com.gfg.practice.avinash.array;

public class ReverseArrayByK {

    public static void main(String[] args) {
        int[] arr = {2,5,3,5,3,45,6,7,3,2,1};
        int k = 3;

       // reverse(arr, 0, 0+k, arr.length,k);

        reverseArrayByK(arr, arr.length,k);

        for(int j = 0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    }

    //optimize method
    static void usingSlidingWindow(int[] arr, int n, int k){

    }

    // iterative method
    static void reverseArrayByK(int[] arr, int n, int k){

        int i = 0;
        while(i<n){
            int start = i;
            int end;
            if(i+k>n)
                end = n;
            else
                end = i+k;

            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end-1];
                arr[end-1] = temp;
                start++;
                end--;
            }
            i = i+k;
        }
    }

    // recursion
    static void reverse(int[] arr, int l,int h,int n, int k){
        if(h>n)
            h=n;

        if(l>n){
            return;
        }

        int start = l;
        int end = h;
        while(start<end){
            int temp;
            temp = arr[start];
            arr[start] = arr[end-1];
            arr[end-1] = temp;
            start++;
            end--;
        }

        reverse(arr,l+k,h+k,n,k);

    }
}
