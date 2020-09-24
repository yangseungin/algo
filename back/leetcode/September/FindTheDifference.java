package September;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        int[] alpha = new int[26];

        for (char c : s.toCharArray())
            alpha[c - 'a']++;

        for (char c : t.toCharArray()){
            alpha[c-'a']--;
            if(alpha[c-'a']==-1) return c;
        }
        return ' ';
    }
}
