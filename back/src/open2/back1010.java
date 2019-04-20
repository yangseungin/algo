package open2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class back1010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 서쪽에 N개의 사이트(사이트는 다리지을수있는 점) 동쪽에M개( N<M) 한개의점은 한개의다리만 가능
		 * 보니까 조합구하면  경우의수 출력되는듯
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		 int count=Integer.parseInt(br.readLine());
		 int N;
		 int M;

		 for(int i=0;i<count;i++){
			 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			 N=Integer.parseInt(st.nextToken());
			 M=Integer.parseInt(st.nextToken());
			 bw.append(String.valueOf(combination(M,N)));
			 bw.append('\n');
		 }
		 bw.flush();

	}

	public static int combination(int n, int m) {
		if (m == 1)
			return n;
		else if (n == m || n == 0)
			return 1;
		else
			return combination(n - 1, m - 1) + combination(n - 1, m);

	}

}
