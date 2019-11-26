package page4;

public class isSubsequence {
	public static void main(String[] args) {
		
		System.out.println(isSubsequence("abc", "ahbgdc"));
	}
	public static boolean isSubsequence(String s, String t){
		int i = 0;
        int idx = 0;
        while (i < s.length()) {
        	idx = t.indexOf(s.charAt(i), idx);
            if (idx == -1) break;
            idx++;
            i++;
        }
        return i == s.length() && idx >= 0;
		
		
	}

}
