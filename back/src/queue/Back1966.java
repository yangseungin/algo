package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Back1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int n = 0; n < T; n++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]), M = Integer.parseInt(s[1]);
            StringTokenizer st = new StringTokenizer(br.readLine());
            LinkedList<Integer> docQ = new LinkedList<>();
            int res = 0;

            for (int i = 0; i < N; i++) {
                docQ.add(Integer.parseInt(st.nextToken()));
            }
            while (!docQ.isEmpty()) {
                boolean isPriority = true;
                for (int i = 1; i < docQ.size(); i++) {
                    if (docQ.peek() < docQ.get(i)) {
                        isPriority = false;
                        break;
                    }
                }
                if (isPriority) {
                    res++;
                    docQ.poll();
                    if (M > 0)
                        M--;
                    else
                        break;


                } else {
                    docQ.add(docQ.poll());
                    M = (M == 0) ? docQ.size() - 1 : --M;
                }

            }
            sb.append(res + "\n");

        }
        System.out.println(sb.toString());
    }
}
