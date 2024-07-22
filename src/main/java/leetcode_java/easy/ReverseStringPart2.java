package leetcode_java.easy;

import java.util.Arrays;

public class ReverseStringPart2 {


    public String reverseString(String s, int k) {
                int left = 0;
                int right = k - 1;
                //if (right <= left) return;
                //abcdef
                char[] ch = s.toCharArray();
//                int len = ch.length;
                for(int i = 0; i<=right;i++) {
                    char tmp = ch[left];
                    if (left == k) {
                        ch[left] = tmp;
                    }
                    if (k < left) {
                        break;
                    } else if (k >= left) {
                        ch[left] = ch[right];
                        ch[right] = tmp;
                        left++;
                        //right--;
                    }
                    if (left == right) {
                        ch[left] = ch[right];
                        ch[right] = tmp;
                        break;
                    }

                }
                return new String(ch);

        }
    public static void main(String[] args) {
        ReverseStringPart2 reverseStringPart2 = new ReverseStringPart2();

        System.out.println(reverseStringPart2.reverseString("abcdefg",2));
    }
}
