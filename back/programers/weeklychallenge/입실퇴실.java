package weeklychallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 입실퇴실 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2}, new int[]{1, 2, 3})));
    }

    public static int[] solution(int[] enter, int[] leave) {
        int n = enter.length;
        int[] answer = new int[n];
        Map<Integer, Integer> room = new HashMap<>();
        int eIdx = 0;
        int lIdx = 0;
        while (eIdx != n && lIdx != n) {
            room.put(enter[eIdx], enter[eIdx]);
            if (room.size() > 1) {
                for (int key : room.keySet()) {
                    answer[key - 1]++;
                }
                answer[enter[eIdx] - 1] += room.size() - 2;
            }

            while (true) {
                if (lIdx < n && room.containsKey(leave[lIdx])) {
                    room.remove(leave[lIdx]);
                    lIdx++;

                } else {
                    break;
                }
            }
            eIdx++;
        }
        return answer;

    }
}
