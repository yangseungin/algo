package Test.gunwookim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 트리플소트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean flag = true;
        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i % 2 != num % 2)
                flag = false;
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
