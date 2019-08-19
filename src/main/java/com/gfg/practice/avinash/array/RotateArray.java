package com.gfg.practice.avinash.array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int gcd = getGCD(7,2);
       // rotate(arr, arr.length, gcd,2);
        leftRotate(arr, arr.length, 2);
        for(int val : arr){
            System.out.println(val);
        }

    }

    static void leftRotate(int arr[], int n,
                           int k)
    {
        /* To get the starting point of
        rotated array */
        int mod = k % n;

        // Prints the rotated array from
        // start position
        for(int i = 0; i < n; ++i)
            System.out.print(arr[(i + mod) % n]
                    + " ");

        System.out.println();
    }

    static void rotate(int[] arr, int n, int gcd, int d){
        int k;
        for(int i=0;i<gcd;i++){
            int temp = arr[i];
            int j = i;
            while(true){
                 k = j + d;

                if(k >= n)
                    k = k-n;

                if(k == i)
                    break;

                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;

        }

    }

    static int getGCD(int a, int b){
        if(b==0)
            return a;
        return getGCD(b, a%b);
    }

}
