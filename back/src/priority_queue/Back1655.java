package priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Back1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(((o1, o2) -> o1 - o2));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (minHeap.size() == maxHeap.size())
                maxHeap.offer(num);
            else
                minHeap.offer(num);
            if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
                if (minHeap.peek() < maxHeap.peek()) {
                    int tmp = minHeap.poll();
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(tmp);
                }
            }
            sb.append(maxHeap.peek() + "\n");
        }
        System.out.println(sb.toString());
    }
}
