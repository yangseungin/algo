package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        list.add(A);
        while (true) {
            int last = list.get(list.size() - 1);
            int tmp = 0;
            while (last != 0) {
                tmp += (int) Math.pow(last % 10, (double) P);
                last /= 10;
            }
            if (list.contains(tmp)) {
                System.out.println(list.indexOf(tmp));
                break;
            }
            list.add(tmp);
        }
    }
}
