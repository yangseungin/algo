package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] chars1;
        char[] chars2;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            chars1 = str1.toCharArray();
            chars2 = str2.toCharArray();

            if (chars1.length != chars2.length) {
                System.out.println("Impossible");
                continue;
            }
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            Boolean flag = true;
            for(int j=0;j<chars1.length;j++){
                if(chars1[j] != chars2[j]){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            if(flag)
                System.out.println("Possible");
            else
                System.out.println("Impossible");


        }
    }
}
