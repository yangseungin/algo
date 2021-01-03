package Test.goodbye2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 끝말잇기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        char start='a';
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            String str = st.nextToken();
            if(i==0)
                start=str.charAt(0);

            if(str.charAt(0)!=start){
                flag=false;
                break;
            }
        }
        if (flag)
            System.out.println(1);
        else
            System.out.println(0);

    }



}
