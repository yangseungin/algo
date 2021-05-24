package page1;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    //    https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int answer = 0;

        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            } else {
                set.add(s.charAt(end++));
                answer = Math.max(answer, end - start);
            }
        }
        return answer;
    }
}
