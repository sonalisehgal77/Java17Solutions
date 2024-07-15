package leetcode_java.easy;

public class ReverseArrayExtraArray {
    public static void reverseArrayExtraArray(int[] arr)
    {
       int len = arr.length;
       int[] reversedArray = new int[len - 1];
       int ctr = 0;
       for(int i = len - 1; i !=0; i--){
           reversedArray[ctr] = arr[i];
           if (i != len){
               ctr++;
           }

       }
        for (int i = 0; i < len - 1 ; i++) {
            System.out.println(reversedArray[i]);

        }
    }

    public static void main(String[] args)
    {
        int[] originalArr = { 1, 2, 3, 4, 5 };
        reverseArrayExtraArray(originalArr);
    }
}
