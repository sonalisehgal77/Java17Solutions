package leetcode_java.medium;
/*
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&envId=top-interview-150
leet code question
 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {

            int[] myIntArray = new int[2];
            int indexOfi = 0;
            int indexOfj = 0;
            for(int i = 0; i<nums.length; i++){
                for(int j = i+1; j<nums.length;j++){
                    if (nums[i]+nums[j]==target){
                        indexOfi = i+1;
                        indexOfj = j+1;
                        myIntArray = new int[]{indexOfi,indexOfj};
                        return myIntArray;

                    }
                }

            }
            return myIntArray;
        }

}
