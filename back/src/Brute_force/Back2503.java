package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] answer = new String[N]; //민혁이가 질문한 세 자리 수
        int[][] info = new int[N][2]; // 0 strike, 1 ball
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            answer[i] = st.nextToken();
            info[i][0] = Integer.parseInt(st.nextToken());
            info[i][1] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i != j) {
                    for (int k = 1; k <= 9; k++) { // 셋째자리
                        if (k != i && k != j) {
                            boolean flag = true;
                            for (int l = 0; l < N; l++) {
                                int strike = 0;
                                int ball = 0;
                                String str = answer[l];
                                if (str.charAt(0) - '0' == i) strike++;
                                if (str.charAt(1) - '0' == j) strike++;
                                if (str.charAt(2) - '0' == k) strike++;
                                if (str.charAt(0) - '0' == j || str.charAt(0) - '0' == k) ball++;
                                if (str.charAt(1) - '0' == i || str.charAt(1) - '0' == k) ball++;
                                if (str.charAt(2) - '0' == i || str.charAt(2) - '0' == j) ball++;
                                if (info[l][0] != strike || info[l][1] != ball) {
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
