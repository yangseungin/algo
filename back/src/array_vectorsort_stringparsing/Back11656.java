package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] arr = new String[S.length()];
        for (int i = 0; i < S.length(); i++) {
            arr[i]=S.substring(i);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(String str :arr){
            sb.append(str+"\n");
        }
        System.out.println(sb);
    }
}
