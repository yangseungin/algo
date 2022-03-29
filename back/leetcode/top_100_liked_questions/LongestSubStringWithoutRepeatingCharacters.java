package top_100_liked_questions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubString("abcabcbb"));
        System.out.println(lengthOfLongestSubString("bbbb"));
    }

    public static int lengthOfLongestSubString(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int result = 0;

        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end++));
                result = Math.max(result, end - start);
            }
        }

        return result;
    }

}
