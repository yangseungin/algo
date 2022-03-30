package top_100_liked_questions;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("ab", ".*"));
        System.out.println(isMatch("mississippi", "mis*is*ip*."));
    }

    public static boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        char[] strChars = s.toCharArray();
        char[] patternChars = p.toCharArray();

        dp[0][0] = true;

        for (int i = 1; i < dp[0].length; i++) {
            // a*bc*
            //true false false false false
            if (patternChars[i - 1] == '*') {
                dp[0][i] = dp[0][i - 2];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                //. 이나 매칭되는 문자열이면
                if (patternChars[j - 1] == '.' || patternChars[j - 1] == strChars[i - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];

                    // *이 오면
                } else if (patternChars[j - 1] == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (patternChars[j - 2] == '.' || patternChars[j - 2] == strChars[i - 1]) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }


    // 다른 풀이 Recursion
    public static boolean isMatch2(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch2(text, pattern.substring(2)) ||
                    (first_match && isMatch2(text.substring(1), pattern)));
        } else {
            return first_match && isMatch2(text.substring(1), pattern.substring(1));
        }
    }
}
