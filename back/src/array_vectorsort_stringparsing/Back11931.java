package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Back11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(br.readLine()));

        list.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++)
            sb.append(list.get(i) + "\n");

        System.out.println(sb);
    }
}
