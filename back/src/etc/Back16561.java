package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back16561 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt=0;
        for (int i = 1; i <= N/3; i++) {
            for (int j = 1; j <= N/3 ; j++) {
                int tmp = i*3 + j*3;
                if((N-tmp)%3 ==0 && N-tmp>0)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
