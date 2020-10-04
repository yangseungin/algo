package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Back18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.equals("pop")) {
                if (deque.size() == 0)
                    sb.append(-1 + "\n");
                else
                    sb.append(deque.removeFirst() + "\n");

            } else if (command.equals("size")) {
                sb.append(deque.size() + "\n");
            } else if (command.equals("empty")) {
                if (deque.size() == 0)
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");

            } else if (command.equals("front")) {
                if (deque.size() == 0)
                    sb.append(-1 + "\n");
                else
                    sb.append(deque.getFirst() + "\n");

            } else if (command.equals("back")) {
                if (deque.size() == 0)
                    sb.append(-1 + "\n");
                else
                    sb.append(deque.getLast() + "\n");

            } else {
                //push
                String[] s = command.split(" ");
                deque.add(Integer.parseInt(s[1]));
            }


        }
        System.out.println(sb.toString());


    }
}
