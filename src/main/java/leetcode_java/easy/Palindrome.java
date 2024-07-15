package leetcode_java.easy;
/*
Valid Palindrome
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/

 */
public class Palindrome {

    int isPalindrome(String S) {
        // code here
        int i = 0;
        int j = S.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (S.charAt(i) != S.charAt(j))
                return 0;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return 1;
    }


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.print(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
