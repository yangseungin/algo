package Test.cheonha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 세상은하나의손수건 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), T = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        String[] direction = new String[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            direction[i] = st.nextToken();
        }
        int idx = 0;
        int x = 0, y = 0;
        int nowDirection = 0;//0,1,2,3 오른 아래 왼 위

        int tmp = 0;
        for (int i = 0; i < N; i++) {
            if (nowDirection == 0)
                x += arr[i] - tmp;
            else if (nowDirection == 1)
                y -= arr[i] - tmp;
            else if (nowDirection == 2)
                x -= arr[i] - tmp;
            else if (nowDirection == 3)
                y += arr[i] - tmp;

            if (direction[idx].equals("right")) {
                nowDirection += 1;
                nowDirection %= 4;
            } else {
                if (nowDirection == 0)
                    nowDirection = 3;
                else
                    nowDirection -= 1;
            }
            tmp = arr[i];
            idx++;

        }

        if (nowDirection == 0)
            x += T - tmp;
        else if (nowDirection == 1)
            y -= T - tmp;
        else if (nowDirection == 2)
            x -= T - tmp;
        else if (nowDirection == 3)
            y += T - tmp;


        System.out.println(x + " " + y);

    }
}
