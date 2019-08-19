 package com.gfg.practice.avinash.array;

 public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};

        printMaxInK(arr,arr.length,4);
    }

    static void printMaxInK(int[] arr, int n, int k){

       for(int i = 0;i<=n-k;i++){
           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;
           for(int j=i;j<i+k;j++){
               if(arr[j] > max)
                   max = arr[j];

               if(arr[j] < min){
                    min = arr[j];
               }

           }
           System.out.println(max +" " +min);
       }

    }
}
