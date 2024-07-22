package leetcode_java.easy;

import java.util.Arrays;

/*

https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

 */
public class kthSmallestInt {
        public static int kthSmallest(int[] arr, int l, int r, int k)
        {
            //Your code here
            Arrays.sort(arr);
            return arr[k-1];

        }

    public static void main(String[] args) {
            int[] arr = new int[]{7,10,4,3,20,15};

        kthSmallestInt smallestInt = new kthSmallestInt();
        int N = smallestInt.kthSmallest(arr,0,6,3);

        System.out.println(N);
    }

}
