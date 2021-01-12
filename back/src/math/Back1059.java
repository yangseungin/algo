package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int L = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < L; i++)
            list.add(Integer.parseInt(st.nextToken()));

        int n = Integer.parseInt(br.readLine());
        list.sort(null);
        if (list.contains(n))
            System.out.println(0);
        else {
            list.add(n);
            list.sort(null);

            if (list.get(0) == n) {
                int tmp = list.get(list.indexOf(n) + 1);
                System.out.println((tmp - n) * n - 1);
            } else {
                int start = list.get(list.indexOf(n) + 1) - n;
                int end = n - list.get(list.indexOf(n) - 1);
                System.out.println(start * end - 1);
            }
        }


    }
}
