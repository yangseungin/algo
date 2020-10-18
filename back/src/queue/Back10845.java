package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Back10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        String line = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            line = br.readLine();
            if (line.contains("push"))
                list.add(Integer.parseInt(line.substring(5, line.length())));
            else if (line.equals("top")) {
                if (list.size() == 0)
                    sb.append(-1 + "\n");
                else
                    sb.append(list.get(list.size() - 1) + "\n");
            } else if (line.equals("size"))
                sb.append(list.size() + "\n");
            else if (line.equals("empty")) {
                if (list.size() == 0)
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            } else if (line.equals("pop")) {
                if (list.size() == 0)
                    sb.append(-1 + "\n");
                else {
                    sb.append(list.get(0) + "\n");
                    list.remove(0);
                }

            } else if (line.equals("front")) {
                if (list.size() == 0)
                    sb.append(-1 + "\n");
                else
                    sb.append(list.get(0) + "\n");
            } else if (line.equals("back")) {
                if (list.size() == 0)
                    sb.append(-1 + "\n");
                else
                    sb.append(list.get(list.size() - 1) + "\n");
            }
        }
        System.out.println(sb);
    }

}
