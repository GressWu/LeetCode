package string;

import java.net.Socket;
import java.util.Arrays;

/*      Write a function that reverses a string. The input string is given as an array of characters char[].

        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        You may assume all the characters consist of printable ascii characters.



        Example 1:

        Input: ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
        Example 2:

        Input: ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]*/
public class reverseString {
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'a'};
        System.out.println(Arrays.toString(a));
        Solution sol = new Solution();
        sol.reverseString(a);
        System.out.println(Arrays.toString(a));
    }
}

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char t;
            t = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = t;
        }
    }
}