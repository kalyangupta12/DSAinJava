package leetcode;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class lengthOfLongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int maxans = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++) {
                if(set.contains(s.charAt(j))){
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                set.add(s.charAt(j));
            }
        }
        return maxans;
    }
    public static void main(String[] args) {
        String s = "abcad";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
