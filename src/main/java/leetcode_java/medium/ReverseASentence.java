package leetcode_java.medium;

public class ReverseASentence {

        static char[] reverseWords(char[] arr) {
            // Reverse all characters
            int n = arr.length;
            mirrorReverse(arr, 0, n - 1);

            // Reverse each word
            Integer wordStart = null;
            for (int i = 0; i < n; i++) {
                if (arr[i] == ' ') {
                    if (wordStart != null) {
                        mirrorReverse(arr, wordStart, i - 1);
                        wordStart = null;
                    }
                } else if (i == n - 1) {
                    if (wordStart != null) {
                        mirrorReverse(arr, wordStart, i);
                    }
                } else {
                    if (wordStart == null) {
                        wordStart = i;
                    }
                }
            }

            return arr;
        }

        // Helper function - reverses the order of items in arr
        // Please note that this is language dependent:
        // If arrays are sent by value, reversing should be done in place

        static void mirrorReverse(char[] arr, int start, int end) {
            while (start < end) {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            // Debugging the code
            char[] arr = { 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
            char[] result = reverseWords(arr);

            System.out.print("Reversed words array: ");
            for (char ch : result) {
                System.out.print(ch);
            }
            System.out.println();
        }


}
