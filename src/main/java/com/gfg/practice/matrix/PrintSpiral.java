package com.gfg.practice.matrix;

public class PrintSpiral {
    public static void main(String[] args) {
        int a[][] = { {1,  2,  3,  4,  5,  6},
            {7,  8,  9,  10, 11, 12},
            {13, 14, 15, 16, 17, 18}
        };

        printSpiral(a,3,6);
    }

    static void printSpiral(int[][] arr, int r, int c){
        int startR = 0;
        int endR = r;
        int startC = 0;
        int endC = c;
        System.out.println("");
        while(startR<endR && startC < endC){

            // left to right
            for(int i = startC;i<endC;++i){
                System.out.print(arr[startR][i] + " ");
            }
            startR+=1;


            // top to bottom

                for(int j = startR; j< endR; ++j){
                    System.out.print(arr[j][endC-1] + " ");
                }
                endC-=1;

            // right to left
            if(startR<endR){
                for(int k = endC-1; k>=startC;--k){
                    System.out.print(arr[endR-1][k] + " ");
                }
                endR-=1;
            }

            // bottom to top
            if(startC<endC) {
                for (int l = endR - 1; l >= startR; --l) {
                    System.out.print(arr[l][startC] + " ");
                }
                startC += 1;
            }
        }
    }
}
