package com.gfg.practice.avinash.recursion2;

public class SpiralPrintFromMatrix {

    private static int[][] arr = {
            {1 ,2 ,3,4},
            {5 ,6 ,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };

    public static void main(String[] args) {

    /*    int topC = 0;
        int bottomC = 3;
        int leftR=0;
        int rightR=3;
        int count = 0;

        while(count <=15){

            for (int i = topC;i<=rightR;i++){
                System.out.print(arr[leftR][i]);
                count++;
            }
            System.out.println("");
            leftR++;

            for(int j = leftR; j<=rightR; j++){
                System.out.print(arr[j][rightR]);
                count++;
            }
            System.out.println("");
            bottomC--;


            for(int k=bottomC;k>=0;k--){
                System.out.print(arr[rightR][k]);
                count++;
            }
            System.out.println("");
            rightR--;

            for(int l=rightR;l>=leftR;l--){
                System.out.print(arr[l][topC]);
                count++;
            }
            System.out.println("");
            topC++;


        }*/

        printMatrixInSpiralWayUsingRecursion(arr,0,0,arr[0].length-1,arr.length-1);
    }


    private static void printMatrixInSpiralWayUsingRecursion(int[][] matrix, int rowStart, int colStart, int colLength,  int rowLength){
        for (int i = rowStart; i <= colLength; i++) {
            System.out.print(matrix[rowStart][i] + " ");
        }
        for (int i = rowStart+1; i <= rowLength; i++) {
            System.out.print(matrix[i][colLength] + " ");
        }

        if(rowStart+1 <= rowLength){
            for (int i = colLength-1; i >= colStart; i--) {
                System.out.print(matrix[rowLength][i] + " ");
            }
        }

        if(colStart+1 <= colLength){
            for (int i = rowLength-1; i > rowStart; i--) {
                System.out.print(matrix[i][colStart] + " ");
            }
        }

        if(rowStart+1 <= rowLength-1 && colStart+1 <= colLength-1){
            printMatrixInSpiralWayUsingRecursion(matrix, rowStart+1, colStart+1, colLength-1, rowLength-1);
        }
    }
}
