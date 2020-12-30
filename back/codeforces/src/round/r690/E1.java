package round.r690;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class E1 {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // len
            cnt=0;
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            combine(arr, visited, 0, n, 3);
            sb.append(cnt+"\n");
        }
        System.out.println(sb);
    }

    public static void combine(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            int min=0,max=0;
            for (int i = 0; i < n; i++) {
                if(visited[i]){
                    min=arr[i];
                    break;
                }
            }
            for (int i = arr.length-1; i >0; i--) {
                if(visited[i]){
                    max=arr[i];
                    break;
                }
            }
            if(max-min<=2)
                cnt++;

            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combine(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }

    }
}
