package Test.sogang2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삼대측정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());
        int[][] candi = new int[N][3];
        int cnt = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Boolean flag = true;
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                candi[i][j] = Integer.parseInt(st.nextToken());
                sum += candi[i][j];

                if (candi[i][j] < L) {
                    flag = false;
                    break;
                }
            }
            if (sum < K)
                flag = false;

            if (flag) {
                cnt++;
                StringBuilder team = new StringBuilder();
                for (int j = 0; j < 3; j++)
                    team.append(candi[i][j] + " ");

                res.append(team.toString());
            }
        }
        System.out.println(cnt);
        System.out.println(res);
    }
}
