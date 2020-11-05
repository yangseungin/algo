package challenges.chall3;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		System.out.println(solution("110010101001"));
	}

	public static int[] solution(String s) {
		int[] answer = new int[2];
		int zeroCount=0;
		int count=0;
		while (!s.equals("1")){
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(c=='1')
					sb.append(c);
				else
					zeroCount++;
			}
			int c = sb.length();
			s=Integer.toBinaryString(c);

			count++;
		}
		answer[0]=count;
		answer[1]=zeroCount;

		return answer;
	}

}
