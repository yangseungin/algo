package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Back10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());
        String line = "";
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < N; i++) {
            line = br.readLine();

            if (line.contains("push_back")) {
                list.add(list.size(), Integer.parseInt(line.substring(10, line.length())));
            } else if (line.contains("push_front")) {
                list.add(0, Integer.parseInt(line.substring(11, line.length())));
            } else if (line.equals("pop_front")) {
                if (list.size() == 0)
                    sb.append(-1+"\n");
                else {
                    sb.append(list.get(0)+"\n");
                    list.remove(0);
                }

            } else if (line.equals("pop_back")) {
                if (list.size() == 0)
                    sb.append(-1+"\n");
                else {
                    sb.append(list.get(list.size() - 1)+"\n");
                    list.remove(list.size() - 1);
                }

            } else if (line.equals("size"))
                sb.append(list.size()+"\n");
            else if (line.equals("empty")) {
                if (list.size() == 0)
                    sb.append(1+"\n");
                else
                sb.append(0+"\n");
            } else if (line.equals("front")) {
                if (list.size() == 0)
                    sb.append(-1+"\n");
                else
                sb.append(list.get(0)+"\n");
            } else if (line.equals("back")) {
                if (list.size() == 0)
                    sb.append(-1+"\n");
                else
                sb.append(list.get(list.size() - 1)+"\n");
            }
        }
        System.out.println(sb);
    }
}
