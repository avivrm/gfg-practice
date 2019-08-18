package com.gfg.practice.recusrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class phoneDigits {
    // Iterative function to find all possible combinations of words
    // formed from mobile keypad
    public static void findCombinations(List<List<Character>> keypad,
                                        int[] input)
    {
        // list to store combinations of all possible words
        List<String> outputList = new ArrayList<>();

        // push all character associated with first digit into output list
        for (Character ch: keypad.get(input[0])) {
            outputList.add(String.valueOf(ch));
        }

        // start from second digit
        for (int i = 1; i < input.length; i++)
        {
            // create a temporary list and clear contents of output list
            List<String> prevList = new ArrayList<>(outputList);
            outputList.clear();

            // for each character associated with current digit in the keypad
            for (Character ch: keypad.get(input[i]))
            {
                // append current character to each word in the output list
                for (String s: prevList) {
                    outputList.add(s + ch);
                }
            }

            // list now contains all possible combinations of words
            // until current digit
        }

        // print output list containing all combinations of words possible
        System.out.println(outputList);
    }

    static void printWordsUtil( List<List<Character>> keypad, int number[], int curr_digit, char output[], int n)
    {
        // Base case, if current output word is prepared
        int i;
        if (curr_digit == n)
        {
            System.out.println(output);
           // output = new char[n+1];
            return ;
        }

               //  Arrays.asList( 'A', 'B', 'C' ),
               // Arrays.asList( 'D', 'E', 'F' ),
               // Arrays.asList( 'G', 'H', 'I' ),

        // Try all 3 possible characters for current digir in number[]
        // and recur for remaining digits
        for (i=0; i < keypad.get(number[curr_digit]).size(); i++)
        {
            output[curr_digit] = keypad.get(number[curr_digit]).get(i);
            printWordsUtil(keypad, number, curr_digit+1, output, n);
            if (number[curr_digit] == 0 || number[curr_digit] == 1)
                return;
        }
    }

    // main function
    public static void main(String[] args)
    {
        List<List<Character>> keypad = Arrays.asList(
                // 0 and 1 digit don't have any characters associated
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList( 'A', 'B', 'C' ),
                Arrays.asList( 'D', 'E', 'F' ),

                Arrays.asList( 'M', 'N', 'O' ),
                Arrays.asList( 'P', 'Q', 'R', 'S'),
                Arrays.asList( 'T', 'U', 'V' ),
                Arrays.asList( 'W', 'X', 'Y', 'Z')
        );

        // input number in the form of an array
        // (number can't start from 0 or 1)
        int[] input = { 2, 3, 4 };

        // find all combinations
        findCombinations(keypad, input);

        printWordsUtil(keypad, input, 0, new char[input.length+1], input.length);
    }
}
