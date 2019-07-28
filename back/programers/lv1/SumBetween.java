package lv1;

public class SumBetween {
	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));

	}

	public static long solution(int a, int b) {
		long answer = 0;
		int big = 0;
		int small = 0;
		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		for (int i = small; i <= big; i++) {
			answer += i;
		}

		return answer;
	}

}
