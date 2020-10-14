package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int idx=N;
        int res=0;

        while (idx-->0){
            int tmp=idx;
            int cal=idx;
            while(cal!=0){
                tmp +=cal%10;
                cal/=10;
            }
            if(tmp==N)
                res=idx;
        }
        System.out.println(res);

    }
}
