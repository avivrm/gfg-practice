package com.gfg.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestWindowChars {

    static final int MAX_CHARS = 256;

    public static void main(String[] args) {
        String line = "lcpsklryvmcpjnbpbwllsrehfmxrkecwitrsglrexvtjmxypunbqfgxmuvgfajclfvenhyuhuorjosamibdn";

        // ecwitrsglrexvtjmxypunbqfgxmuvgfajclfvenhyuhuorjosamibdn

        getLength(line);

        getWindowLength(line);
    }

    static void getLength(String str){
        Map<String, Integer> m = new HashMap<>();
        for(int i=0;i<str.length();i++){

            if(m.containsKey(String.valueOf(str.charAt(i)))){
                int frequency = m.get(String.valueOf(str.charAt(i)));
                if(frequency-1 == 0){
                    m.remove(String.valueOf(str.charAt(i)));
                }else{
                    m.put(String.valueOf(str.charAt(i)), frequency-1);
                }
            }else{
                m.put(String.valueOf(str.charAt(i)), 1);
            }
        }

        System.out.println(m.size());
    }

    static void getWindowLength(String str){
        int n = str.length();

        // Count all distinct characters.
        int dist_count = 0;

        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i=0; i<n; i++)
        {
            if (visited[str.charAt(i)] == false)
            {
                visited[str.charAt(i)] = true;
                dist_count++;
            }
        }

        // Now follow the algorithm discussed in below
        // post. We basically maintain a window of characters
        // that contains all characters of given string.
        // https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;

        int count = 0;
        int[] curr_count =  new int[MAX_CHARS];
        for (int j=0; j<n; j++)
        {
            // Count occurrence of characters of string
            curr_count[str.charAt(j)]++;

            // If any distinct character matched,
            // then increment count
            if (curr_count[str.charAt(j)] == 1 )
                count++;

            // if all the characters are matched
            if (count == dist_count)
            {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (curr_count[str.charAt(start)] > 1)
                {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }

                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // Return substring starting from start_index
        // and length min_len
        System.out.println(str.substring(start_index, start_index+min_len).length());
    }

}
