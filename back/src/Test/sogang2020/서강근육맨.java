package Test.sogang2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 서강근육맨 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<BigInteger> list = new ArrayList<>();
        BigInteger sum = new BigInteger("0");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(new BigInteger(st.nextToken()));
            sum = sum.add(list.get(i));
        }
        Collections.sort(list);

        BigInteger tmp = list.get(list.size() - 1);
        if (N % 2 != 0)
            list.remove(list.size() - 1);

        BigInteger max = BigInteger.ZERO;
        for (int i = 0; i < list.size() / 2; i++) {
            BigInteger cal = list.get(i).add(list.get(list.size() - 1 - i));
            if (cal.compareTo(max) == 1)
                max = cal;

        }
        if (N % 2 != 0) {
            if (tmp.compareTo(max) == 1)
                System.out.println(tmp.toString());
            else if (tmp.compareTo(max) == -1)
                System.out.println(max.toString());
            else
                System.out.println(tmp.toString());
        }else
            System.out.println(max.toString());





    }
}
