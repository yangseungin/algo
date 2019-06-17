package highscorekit.greedy;

import java.util.ArrayList;

public class GymSuit {
	public static void main(String[] args) {
		System.out.println(solution(5, new int[] { 2, 4 }, new int[] { 3 }));

	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		ArrayList<Integer> lostList = new ArrayList<Integer>(); // @2
		for (int i = 0; i < lost.length; i++)
			lostList.add(lost[i]);

		ArrayList<Integer> reserveList = new ArrayList<Integer>(); // @3
		for (int i = 0; i < reserve.length; i++)
			reserveList.add(reserve[i]);

		// 여분옷이있는데 읽어버
		for (int i = 0; i < lostList.size(); i++) {
			for (int j = 0; j < reserveList.size(); j++) {
				if (lostList.get(i) == reserveList.get(j)) {
					lostList.remove(i);
					reserveList.remove(j);
					i--;
					answer++;
					break;
				}
			}
		}

		// 빌려준애는 음수처리
		for (int i = 0; i < lostList.size(); i++) {
			for (int j = 0; j < reserveList.size(); j++) {
				if (Math.abs(lostList.get(i) - reserveList.get(j)) == 1) {
					reserveList.remove(j);
					answer++;
					break;
				}
			}
		}

		return answer;
	}

}
