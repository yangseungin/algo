package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Back5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] split = input.substring(1, input.length() - 1).split(",");
            Deque<Integer> deque = new LinkedList<>();
            int direction = 0;
            for (int i = 0; i < split.length; i++) {
                if (!split[i].equals(""))
                    deque.addFirst(Integer.parseInt(split[i]));
            }


            boolean errorCheck = false;
            for (int i = 0; i < p.length(); i++) {
                char c = p.charAt(i);
                if (c == 'R')
                    if (direction == 0)
                        direction = 1;
                    else
                        direction = 0;
                else if (c == 'D') {
                    if (deque.isEmpty()) {
                        errorCheck = true;
                        break;
                    }
                    if (direction == 0)
                        deque.removeLast();
                    else
                        deque.removeFirst();
                }
            }
            if (errorCheck)
                sb.append("error\n");
            else {
                sb.append("[");
                int size = deque.size();
                if (direction == 0) {
                    for (int i = 0; i < size; i++) {
                        sb.append(deque.removeLast());
                        if (!deque.isEmpty())
                            sb.append(",");
                    }

                } else {
                    for (int i = 0; i < size; i++) {
                        sb.append(deque.removeFirst());
                        if (!deque.isEmpty())
                            sb.append(",");
                    }
                }
                sb.append("]\n");
            }

        }
        System.out.println(sb);
    }
}
