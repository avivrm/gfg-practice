package com.gfg.practice.avinash.array;

public class StockPrice {
    public static void main(String[] args) {
        int[] arr = {8,7,4,9,20,1,10};
        inOrderOfN(arr, arr.length);
    }

    static void getMaxProfit(int[] arr, int n){
        int maxProfit= Integer.MIN_VALUE;
        int startI = -1;
        int endI = -1;

        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(arr[j]> arr[i]){

                    int diff = arr[j] - arr[i];

                    if(diff> maxProfit){
                        maxProfit = diff;
                        startI = i;
                        endI = j;
                    }

                }
            }
        }

        System.out.println(maxProfit);
        System.out.println(startI);
        System.out.println(endI);
    }

    static void inOrderOfN(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        int diff = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            if(arr[i] < min)
                min = arr[i];
            else{

                if(diff < arr[i] - min){
                    diff = arr[i]-min;
                }
            }
        }

        System.out.println(diff);
    }
}
