package codility.test;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	public static void main(String[] args) {
		System.out.println(solution(1041));
		System.out.println(solution(528));
		System.out.println(solution(15));
		System.out.println(solution(32));

	}

	public static int solution(int N) {

		char[] binary = Integer.toBinaryString(N).toCharArray();
		List<Character> list = new ArrayList<>();
		for (char ch : binary) {
			list.add(ch);
		}

		while (list.get(list.size() - 1) == '0') {
			list.remove(list.size() - 1);

		}
		System.out.println(list.toString());
		int result = 0;
		int tmpCount = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == '1') {
				if (tmpCount > result) {
					result = tmpCount;
				}
				tmpCount = 0;
			}else{
				tmpCount++;
			}
		}

		return result;
	}

}
