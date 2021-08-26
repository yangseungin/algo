package weeklychallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 직업군추천하기 {
    public static void main(String[] args) {
        System.out.println(
                solution(new String[]{"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"},
                        new String[]{"PYTHON", "C++", "SQL"}, new int[]{7, 5, 5}));
    }

    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            map.put(languages[i], preference[i]);
        }

        List<String> result = new ArrayList<>();
        int highScore = Integer.MIN_VALUE;
        for (int i = 0; i < table.length; i++) {
            StringTokenizer st = new StringTokenizer(table[i], " ");
            int sum = 0;
            String str = st.nextToken();

            int point = 5;
            while (st.hasMoreTokens()) {
                String lan = st.nextToken();
                if (map.containsKey(lan)) {
                    sum += (map.get(lan) * point);
                }
                point--;
            }

            if (highScore < sum) {
                highScore = sum;
                result.clear();
                result.add(str);
                answer = str;
            } else if (highScore == sum) {
                result.add(str);
            }
        }

        if (result.size() > 1) {
            Collections.sort(result);
            answer = result.get(0);
        }
        return answer;
    }
}
