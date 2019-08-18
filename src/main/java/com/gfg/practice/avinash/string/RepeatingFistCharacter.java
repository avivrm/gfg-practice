package com.gfg.practice.string;

public class RepeatingFistCharacter {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        occured(str);
    }

    static void occured(String str){
        int res = Integer.MAX_VALUE;

        int[] visited = new int[256];

        for(int i = 0; i<visited.length;i++){
            visited[i] = -1;
        }

        for (int j = 0;j<str.length();j++){
            if(visited[str.charAt(j)] == -1){
                visited[str.charAt(j)] = j;
            }else{
                res = Math.min(res, visited[str.charAt(j)]);
            }
        }

        if(res == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.printf(visited[res]+"");
    }


}
