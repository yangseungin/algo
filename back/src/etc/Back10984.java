package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int cnt=0;
            float grade =0;
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                cnt+=num;
                grade+= num*Float.parseFloat(st.nextToken());
            }
            System.out.println(cnt+" "+String.format("%.1f",grade/cnt));
        }

    }
}
