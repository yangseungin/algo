package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                char tmp=arr[i][j];
                arr[i][j]=arr[i][j+1];
                arr[i][j+1]=tmp;
                //계산하고

                //되돌리기
                tmp=arr[i][j+1];
                arr[i][j+1]=arr[i][j];
                arr[i][j]=tmp;

                //세로도 체크하는 로직 추가



            }
        }


    }

}
