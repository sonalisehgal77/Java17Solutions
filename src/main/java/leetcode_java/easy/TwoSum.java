package leetcode_java.easy;
/*

Two Sum – Problem
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

 */
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {

            int[] myIntArray = new int[2];
            for(int i = 0; i<nums.length; i++){
                for(int j = i+1; j<nums.length;j++){
                    if (nums[i]+nums[j]==target){
                        myIntArray = new int[]{i,j};
                        return myIntArray;

                    }
                }

            }
            return myIntArray;
        }

}
