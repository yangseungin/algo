package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //학생수
        int K = Integer.parseInt(st.nextToken()); //최대 방크기
        int[][] student = new int[6][2];
        int room = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            student[grade - 1][gender]++;
        }
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[0].length; j++) {
                if (student[i][j] == 0)
                    continue;
                room += student[i][j] / K;
                if (student[i][j] % K != 0) {
                    room++;
                }
            }
        }

        System.out.println(room);

    }
}
