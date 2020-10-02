package list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = 0;
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
            number.add(num++);
        }

        while (list.size() > 0) {
            System.out.println(number.get(idx) + 1);
            if (--N == 0)
                break;
            int move = list.remove(idx).intValue();
            number.remove(idx);
            if (move > 0)
                idx += (move - 1);
            else if (move < 0) {
                idx = N + (idx + move) % N;
            }
            idx %= N;
        }
    }
}
