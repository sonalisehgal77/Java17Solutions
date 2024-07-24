package leetcode_java.easy;

import java.util.Arrays;

public class ReverseStringPart2 {


    public String reverseStr(String s, int k) {
                // convert string to char array
                char[] ch = s.toCharArray();
                // iterate over char array with k * 2 step
                for (int i = 0; i < s.length() - 1; i += (k * 2)) {
                    // declare left and right pointers
                    int l = i, r = Math.min(i + k - 1, s.length() - 1);
                    // swap chars in array with pointers
                    while (l < r) {
                        // store char int tmp variable
                        char tmp = ch[l];
                        // swap char from right to left pointer ad increment left pointer
                        ch[l++] = ch[r];
                        // assign tmp char that we store and increment right pointer
                        ch[r--] = tmp;
                    }
                }
                // construct string from char array and return it
                return new String(ch);
            }


    public static void main(String[] args) {
        ReverseStringPart2 reverseStringPart2 = new ReverseStringPart2();

        System.out.println(reverseStringPart2.reverseStr("abcdefg",2));
    }
}
