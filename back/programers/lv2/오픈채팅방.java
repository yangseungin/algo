package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 오픈채팅방 {
    //    https://programmers.co.kr/learn/courses/30/lessons/42888
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})));

    }

    public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> log = new ArrayList<>();

        for (String str : record) {
            StringTokenizer st = new StringTokenizer(str);
            String command = st.nextToken();
            String id = st.nextToken();
            String nickname = !command.equals("Leave") ? st.nextToken() : "";

            switch (command) {
                case "Enter":
                    map.put(id, nickname);
                    log.add(id + "님이 들어왔습니다.");

                    break;
                case "Leave":
                    log.add(id + "님이 나갔습니다.");

                    break;
                case "Change":
                    map.put(id, nickname);
                    break;
            }
        }
        String[] answer = new String[log.size()];
        for (int i = 0; i < log.size(); i++) {
            int idIdx = log.get(i).indexOf("님");
            String id = log.get(i).substring(0, idIdx);
            answer[i] = log.get(i).replace(id, map.get(id));
        }
        return answer;
    }
}

