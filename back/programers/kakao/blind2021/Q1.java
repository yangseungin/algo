package kakao.blind2021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
        System.out.println(Arrays.toString(solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> reported = new HashMap<>();
        Map<String, Integer> ans = new HashMap<>();
        report = Arrays.stream(report).distinct().toArray(String[]::new);

        for (String repo : report) {
            String[] s = repo.split(" ");
            reported.put(s[1], reported.getOrDefault(s[1], 0) + 1);
        }
        for (String repo : report) {
            String[] s = repo.split(" ");
            if (reported.get(s[1]) >= k) {
                ans.put(s[0], ans.getOrDefault(s[0], 0) + 1);
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = ans.getOrDefault(id_list[i], 0);
        }


        return answer;
    }

}
