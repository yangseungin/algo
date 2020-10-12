package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Back7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            if (s[1].equals("enter"))
                set.add(s[0]);
            else
                set.remove(s[0]);
        }
        StringBuilder sb = new StringBuilder();
        set.stream().sorted(Comparator.reverseOrder()).forEach(s -> sb.append(s + "\n"));
        System.out.println(sb.toString());
    }
}
