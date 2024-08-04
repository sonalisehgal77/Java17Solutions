package leetcode_java.easy.hashMaps;

import java.util.HashMap;
import java.util.Map;

/*

 */

public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int freq = 0;
        for(char c : allowed.toCharArray()){
            freq|=1<<(c-'a');
        }
        int res = words.length;
        for(String word: words){
            for(char c : word.toCharArray()){
                if((freq & 1<<(c-'a'))==0){
                    res--;
                    break;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(consistentStrings.countConsistentStrings(allowed,words));
    }
}
