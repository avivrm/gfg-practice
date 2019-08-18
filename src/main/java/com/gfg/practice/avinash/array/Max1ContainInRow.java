package com.gfg.practice.array;

public class Max1ContainInRow {
    public static void main(String[] args) {
        int[][] arr = {
                {0,0,0,0,1},
                {0,0,0,1,1},
                {0,1,1,1,1},
                {1,1,1,1,1},
                {0,1,1,1,1}
        };
        System.out.println(getIndex(arr));
    }

    static int getIndex(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length-1;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < rows;i++ )
        {
            while(columns>=0){
                    if(arr[i][columns] == 1){
                        index = i;
                        columns--;
                    }else{
                         break;
                    }
            }
        }
        return index;
    }
}
