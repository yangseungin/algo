package lv5;

public class NNumberGame {
	public static void main(String[] args) {

		System.out.println(solution(2, 4, 2, 1));
		// System.out.println(solution(16,16,2,1));
		// System.out.println(solution(16,16,2,2));

	}

	public static String solution(int n, int t, int m, int p) {
		String answer = "";
		String s = "";

		for (int i = 0; i < t * m; i++) {
			s += nNum(i, n);
		}

		for (int i = 0; i < t; i++) {
			answer += s.charAt(p - 1);
			p += m;
		}

		return answer;
	}

	public static String nNum(int num, int n) {
		String tmp = "";
		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while (num / n != 0) {
			int tmpNum = 0;
			tmpNum = num % n;
			tmp = c[tmpNum] + tmp;
			num /= n;
		}
		tmp = c[num % n] + tmp;

		return tmp;
	}

}
