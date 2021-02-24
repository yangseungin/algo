package round.r702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                list.add(arr[i]);
            }
            int len = list.size();
            for (int i = 0; i < len - 1; i++) {
                if (Math.min(list.get(i), list.get(i + 1)) * 2 >= Math.max(list.get(i), list.get(i + 1))) {
                    list.add(i + 1, (list.get(i) + list.get(i + 1)) / 2);
                    count++;
                    len++;
                }
            }
            System.out.println(count);
        }
        System.out.println(sb);

    }
}
