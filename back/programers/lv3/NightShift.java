package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class NightShift {
	public static void main(String[] args) throws NumberFormatException, IOException {

	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//int n=Integer.parseInt(br.readLine());

		int n = 4;
		int[] works = { 4, 3, 3 };

		bw.write(String.valueOf(solution(n, works)));
		bw.flush();

	}

	 
	// 정확성은 올 성공했는데 효율성 0점... 테스트1부터 시간초과난다... 이유는?
	public static long solution(int n, int[] works) {
		long answer = 0;
		int worksLen = works.length;

		for (int i = 0; i < n; i++) {
			Arrays.sort(works);
			if (works[worksLen - 1] > 0)
				works[worksLen - 1] -= 1;

		}

		for (int i = 0; i < worksLen; i++) {
			answer += works[i] * works[i];
		}

		return answer;
	}

}
