package leetcode_java.easy.hashMaps;
/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] result = nums.clone();
            Arrays.sort(result);
            Map<Integer, Integer> index = new HashMap<>();

            for(int i = 0;i<result.length;i++) {
                index.putIfAbsent(result[i],i);
            }
            for(int i = 0;i<result.length;i++) {
                result[i] = index.get(nums[i]);
            }
            return result;
        }

    public static void main(String[] args) {
        SmallerNumbersThanCurrent sol = new SmallerNumbersThanCurrent();
        int[] nums = {8,1,2,2,3};
        //System.out.print(nums.length);
        System.out.println(Arrays.toString(sol.smallerNumbersThanCurrent(nums)));
    }

}
