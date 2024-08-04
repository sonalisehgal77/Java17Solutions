package leetcode_java.easy.hashMaps;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class NumOfIdenticalPairs {
        public int numIdenticalPairs(int[] nums) {
            HashMap<Integer, List<Integer>> map = new HashMap<>();

            int result = 0;
            for(int i = 0;i<nums.length;i++){
                if(map.get(nums[i]) == null){
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    map.put(nums[i],list);
                } else {
                    List<Integer> list = map.get(nums[i]);
                    result += list.size();
                    list.add(nums[i]);
                    map.put(nums[i],list);
                }
            }
            return result;
        }

    public static void main(String[] args) {
        NumOfIdenticalPairs sol = new NumOfIdenticalPairs();
        int[] nums = {1,2,3,1,1,3};
        //System.out.print(nums.length);
        System.out.println(sol.numIdenticalPairs(nums));
    }

}
