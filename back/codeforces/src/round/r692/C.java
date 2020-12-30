package round.r692;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println(date);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
                arr[y-1][x-1]=1;
            }
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr.length; j++) {
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }

        }
        System.out.println(sb);

    }

}
