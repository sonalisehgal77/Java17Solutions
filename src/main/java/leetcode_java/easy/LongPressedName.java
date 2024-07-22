package leetcode_java.easy;
/*
https://leetcode.com/problems/long-pressed-name/description
 */


public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
       int i = 0;
       int j = 0;
       while(j<typed.length()){
           if(i < name.length() && name.charAt(i) == typed.charAt(j)){
               i++;
               j++;
           } else {
               if (j!=0 && name.charAt(i-1) == typed.charAt(j)){
                   j++;
               } else {
                   return false;
               }
           }
       }
       return i==name.length();

    }
}
