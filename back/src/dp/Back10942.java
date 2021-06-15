package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10942 {
    //    https://www.acmicpc.net/problem/10942
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        boolean[][] dp = new boolean[N + 1][N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //같은경우는 무조건 팰린드롬
        for(int i = 1; i <= N; i++)
            dp[i][i] = true;
        //길이가 2면 두숫자만 같으면 됨
        for(int i = 1; i <= N - 1; i++)
            if(arr[i] == arr[i + 1])
                dp[i][i + 1]= true;

        //길이가 3이상
        for(int i = 2; i < N; i++){
            for(int j = 1; j <= N - i; j++){
                if(arr[j] == arr[j + i] && dp[j + 1][j + i - 1])
                    dp[j][j + i] = true;
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if (dp[start][end]) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);
    }
}
