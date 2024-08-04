package leetcode_java.easy.hashMaps;

import java.util.*;
import java.util.stream.Collectors;

public class SortThePeople {

        public String[] sortPeople(String[] names, int[] heights) {

                int n = names.length;
                Map<Integer, String> mapping = new HashMap<>();

                for (int i = 0; i < n; ++i) {
                    mapping.put(heights[i], names[i]);
                }

                Arrays.sort(heights);
                for (int i = 0; i < n / 2; ++i) {
                    int temp = heights[i];
                    heights[i] = heights[n - 1 - i];
                    heights[n - 1 - i] = temp;
                }

                for (int i = 0; i < n; ++i) {
                    names[i] = mapping.get(heights[i]);
                }

                return names;
            }


    public static void main(String[] args) {
        SortThePeople sortThePeople = new SortThePeople();
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        System.out.println(Arrays.toString(sortThePeople.sortPeople(names, heights)));


    }

}
