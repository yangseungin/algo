package open1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back1550 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split("");

		int result = 0;
		int digit = 1;

		//아스키코드로 A~F인경우 A으 아스키값을빼서 10진수를 구하고 아닌경우엔 0의 아스키를빼서 차이를 구한다
		for (int i = 0; i < str.length; i++) {
			int num = str[str.length - i - 1].charAt(0);
			if (num >= 'A' && num <= 'F')
				num = num - 'A' + 10;
			else
				num = num - '0';
			result += num * digit;
			digit *= 16;
		}

		bw.write(String.valueOf(result));
		bw.flush();

	}

}
