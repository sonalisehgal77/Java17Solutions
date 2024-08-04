package leetcode_java.easy.hashMaps;
/*
https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
 */
import java.util.*;

public class CountKDifference {
        public int countKDifference(int[] nums, int k) {
                Map<Integer,Integer> map = new HashMap<>();
                int res = 0;

                for(int i = 0;i< nums.length;i++){
                    if(map.containsKey(nums[i]-k)){
                        res+= map.get(nums[i]-k);
                    }
                    if(map.containsKey(nums[i]+k)){
                        res+= map.get(nums[i]+k);
                    }
                    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                }


                return res;

            }

    public static void main(String[] args) {
        CountKDifference countKDifference = new CountKDifference();
        int[] nums = {1,2,2,1};
        int k = 1;
        countKDifference.countKDifference(nums,k);



    }

}
