package goodbye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            Set<Double> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++)
                    set.add(((double) (arr[j] - arr[i]) / 2));
            }
            sb.append(set.size() + "\n");
        }
        System.out.println(sb);

    }
}
