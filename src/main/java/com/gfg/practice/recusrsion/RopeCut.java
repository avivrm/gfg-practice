package com.gfg.practice.recusrsion;

public class RopeCut {

    public static void main(String[] args) {

        int n = 23;
        int a = 9;
        int b = 11;
        int c = 12;
        System.out.println(cutRope(n,a,b,c));

    }

    static int cutRope(int rope, int a, int b, int c){
        if(rope < 0){
            return -1;
        }else if(rope == 0){
            return 0;
        }

        int cutA = cutRope(rope-a, a,b,c);
        int cutB = cutRope(rope-b, a,b,c);
        int cutC = cutRope(rope-c, a,b,c);

        int max = getMax(cutA,cutB,cutC);

        if(max == -1)
            return -1;

        return 1 + max;

    }

    static int getMax(int a, int b, int c){
        if(a == b && b == c)
            return a;
        if(a>b && a>c )
            return a;
        else if(b>c && b>a)
            return b;
        else
            return c;
    }


}
