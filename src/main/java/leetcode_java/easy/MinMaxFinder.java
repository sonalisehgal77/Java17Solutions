package leetcode_java.easy;

/*
https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
public class MinMaxFinder {

    public static int setmaxi(int[] arr, int N){
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static int setmini(int[] arr, int N){
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

    public static void main(String[] args)
    {
        int[] A = { 4, 9, 6, 5, 2, 3 };
        int N = A.length;
        System.out.println("Minimum element is: "
                + setmini(A, N));
        System.out.println("Maximum element is: "
                + setmaxi(A, N));
    }
}
