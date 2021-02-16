package education.r104;

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
        while (t-- > 0) {
            Set<Integer> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int mincount = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                set.add(arr[i]);
            }
            int min = arr[0];
            for (int i = 0; i < n; i++) {
                if (min > arr[i]) {
                    mincount = 1;
                    min = arr[i];
                } else if (min == arr[i]) {
                    mincount++;
                }
            }
            sb.append((n - mincount) + "\n");
        }
        System.out.println(sb);
    }
}
