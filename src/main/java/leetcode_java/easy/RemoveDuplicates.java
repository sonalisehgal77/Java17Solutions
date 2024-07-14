package leetcode_java.easy;
/*
Remove Duplicates from sorted array

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

 */
public class RemoveDuplicates {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 1)
                return nums.length;
            int[] temp = new int[nums.length];
            int j = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1])
                    temp[j++] = nums[i];
            }
            temp[j++] = nums[nums.length - 1];
            System.arraycopy(temp, 0, nums, 0, j);
            return j;
        }
}
