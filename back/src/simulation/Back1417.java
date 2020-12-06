package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        if(N==1){
            System.out.println(0);
            return;
        }
        int[] arr = new int[N-1];
        for (int i = 0; i < N-1; i++)
            arr[i]=Integer.parseInt(br.readLine());

        int cnt=0;
        Arrays.sort(arr);
        while (dasom<=arr[arr.length-1]){
            arr[N-2]--;
            dasom++;
            Arrays.sort(arr);
            cnt++;
        }
        System.out.println(cnt);


    }
}
