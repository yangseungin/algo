package dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back11726 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[1001];

		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i <=n; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
		}
		bw.write(String.valueOf(arr[n]));
		bw.flush();
	}
}
