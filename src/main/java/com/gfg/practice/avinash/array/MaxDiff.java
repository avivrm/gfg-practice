package com.gfg.practice.array;

public class MaxDiff {

    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};
        System.out.println(maxDiff2(arr, arr.length));
    }

    static int maxDiff(int[] arr, int n){

        int maxDiff = Integer.MIN_VALUE;

        int maxRight = arr[n-1];

        for(int i= n-2;i >= 0;i--){

            if(arr[i] > maxRight)
                maxRight = arr[i];
            else {
                int diff = (maxRight - arr[i]);
                if( diff > maxDiff){
                    maxDiff = diff;
                }
            }

        }

        return maxDiff;
    }

    // with auxillary array
    // help in finding the max sum in subarray too
    static int maxDiff2(int arr[], int n)
    {
        // Create a diff array of size n-1. The array will hold
        //  the difference of adjacent elements
        int diff[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            diff[i] = arr[i + 1] - arr[i];

        // Now find the maximum sum subarray in diff array
        int max_diff = diff[0];
        for (int i = 1; i < n - 1; i++)
        {
            if (diff[i - 1] > 0)
                diff[i] += diff[i - 1];
            if (max_diff < diff[i])
                max_diff = diff[i];
        }
        return max_diff;
    }

    // removing auxilary array
    int maxDiff3(int arr[], int n)
    {
        // Initialize diff, current sum and max sum
        int diff = arr[1]-arr[0];
        int curr_sum = diff;
        int max_sum = curr_sum;

        for(int i=1; i<n-1; i++)
        {
            // Calculate current diff
            diff = arr[i+1]-arr[i];

            // Calculate current sum
            if (curr_sum > 0)
                curr_sum += diff;
            else
                curr_sum = diff;

            // Update max sum, if needed
            if (curr_sum > max_sum)
                max_sum = curr_sum;
        }

        return max_sum;
    }

}
