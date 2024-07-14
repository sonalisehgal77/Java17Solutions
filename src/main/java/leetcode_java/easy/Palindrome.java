package leetcode_java.easy;
/*
Valid Palindrome
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/

 */
public class Palindrome {

        public boolean isPalindrome(String s) {
            String str = s.toLowerCase().trim();
            str=str.replace(',',' ');
            str=str.replace(':',' ');
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = str.length();
            int len = right/2;
            if(right%2==0){
                for(int i=0;i!=len;i++){
                    if(charArray[i]==charArray[len]){
                        len--;
                    } else if (charArray[i]!=charArray[len]){
                        return false;
                    }
                }
                return true;
            } else if(right%2!=0) {
                return false;
            }
            return false;
        }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.print(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
