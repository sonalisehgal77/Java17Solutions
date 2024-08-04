package leetcode_java.easy.hashMaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> charsSet = jewels.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(charsSet);

        ArrayList<Character> stonesList = stones.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(stonesList);
//        Set<Integer> intersection = new HashSet<>(charsSet);
//        intersection.retainAll(stonesSet);
//        Set<String> intersection = new HashSet<String>(charsSet); // use the copy constructor
//        intersection.retainAll(stones);

         // charsSet.retainAll(stonesList);
        int count = 0;
        for (Character ch : stonesList) {
            if (charsSet.contains(ch)) {
                count++;
            }
        }
        System.out.println("has common elements-"+count);


//        long count = charsSet.stream().filter(tempstring -> {
//            return stonesList.stream().forEach(System.out::println);
////            });
//        }).count();
//        if (count > 0)
//            System.out.println("has common elements-"+count);
//        else
//            System.out.println("not common");
        return count;
    }
    public static void main(String[] args) {
        JewelsandStones jewelsandStones = new JewelsandStones();
        String jewels="aA";
        String stones="aAAbbbb";
        jewelsandStones.numJewelsInStones(jewels,stones);

    }
}
