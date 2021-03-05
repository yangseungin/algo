package round.r702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[] count = new int[3];
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                count[arr[i] % 3]++;
            }
            for (int i = 0; i < 3; i++) {
                sum += count[i];
            }
            int avg = sum / 3;
            int res = 0;
            for (int i = 2; i > 0; i--) {
                if (count[i] > avg) {
                    int tmp = count[i] - avg;
                    count[i] -= tmp;
                    count[(i + 1) / 3] += tmp;
                    res += tmp;
                } else if (count[i] < avg) {
                    int tmp = avg - count[i];
                    count[i] += tmp;
                    if(i>0){
                       count[(i-1)]-=tmp;
                    }else {
                        count[2]-=tmp;
                    }
                    res += tmp;
                }
            }
            sb.append(res+"\n");
        }
        System.out.println(sb);

    }
}
