package lv1;

public class SubtringMiddle {
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}

	public static String solution(String s) {
		if (s.length() % 2 == 0) {
			return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		} else {
			return s.substring(s.length() / 2,s.length() / 2+1);
		}

	}

}
