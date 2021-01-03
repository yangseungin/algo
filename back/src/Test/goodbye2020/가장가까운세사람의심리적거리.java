package Test.goodbye2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장가까운세사람의심리적거리 {
    //왜 틀렸는지 확인 필요 -> 가장 가까운 거리가 붙어있는게 아니고 임의의 3명임
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] arr = new String[N];
            for (int i = 0; i < N; i++)
                arr[i] = st.nextToken();

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        int tmp = 0;
                        tmp += getDistance(arr[i], arr[j]);
                        tmp += getDistance(arr[j], arr[k]);
                        tmp += getDistance(arr[k], arr[i]);
                        min = Math.min(min, tmp);
                        if (min == 0)
                            break;
                    }
                    if (min == 0)
                        break;
                }
                if (min == 0)
                    break;
            }
            sb.append(min + "\n");
        }
        System.out.println(sb);
    }

    private static int getDistance(String num1, String num2) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (num1.charAt(i) != num2.charAt(i))
                count++;
        }
        return count;
    }
}
