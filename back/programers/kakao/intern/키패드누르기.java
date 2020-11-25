package kakao.intern;

import java.util.HashMap;
import java.util.Map;

public class 키패드누르기 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }, "right"));
		System.out.println(solution(new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 }, "left"));
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, "right"));

	}

	public static String solution(int[] numbers, String hand) {
		Map<Integer, Integer> hor = new HashMap<>();
		hor.put(1, 1);
		hor.put(2, 1);
		hor.put(3, 1);
		hor.put(4, 2);
		hor.put(5, 2);
		hor.put(6, 2);
		hor.put(7, 3);
		hor.put(8, 3);
		hor.put(9, 3);
		hor.put(10, 4);
		hor.put(0, 4);
		hor.put(11, 4);
		hor.put(12, 4);
		Map<Integer, Integer> height = new HashMap<>();
		height.put(1, 1);
		height.put(2, 2);
		height.put(3, 3);
		height.put(4, 1);
		height.put(5, 2);
		height.put(6, 3);
		height.put(7, 1);
		height.put(8, 2);
		height.put(9, 3);
		height.put(0, 2);
		height.put(10, 1);
		height.put(11, 2);
		height.put(12, 3);

		String answer = "";
		int lHand = 10, rHand = 12;
		for (int num : numbers) {
			
			if (num == 1 || num == 4 || num == 7) {
				lHand = num;
				answer += "L";
			} else if (num == 3 || num == 6 || num == 9) {
				rHand = num;
				answer += "R";
			} else {
				int lLen = Math.abs(hor.get(lHand) - hor.get(num)) + Math.abs(height.get(lHand) - height.get(num));
				int rlen = Math.abs(hor.get(rHand) - hor.get(num)) + Math.abs(height.get(rHand) - height.get(num));
				if (lLen == rlen) {
					// 거리가 같으
					if (hand.equals("right")) {
						answer += "R";
						rHand = num;
					} else {
						answer += "L";
						lHand = num;
					}
				} else if (lLen > rlen) {
					// 오른손이 가까
					answer += "R";
					rHand = num;
				} else {
					answer += "L";
					lHand = num;
				}
			}
		}
		return answer;
	}

}
