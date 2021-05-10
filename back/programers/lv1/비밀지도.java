package lv1;

import java.util.Arrays;

public class 비밀지도 {
    //    https://programmers.co.kr/learn/courses/30/lessons/17681
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            String input1 = Integer.toBinaryString(arr1[i]);
            String input2 = Integer.toBinaryString(arr2[i]);
            StringBuilder sb = new StringBuilder();
            if (input1.length() < n) {
                for (int j = 0; j < n - input1.length(); j++) {
                    sb.append("0");
                }
                sb.append(input1);
                input1 = sb.toString();
            }
            sb = new StringBuilder();
            if (input2.length() < n) {
                for (int j = 0; j < n - input2.length(); j++) {
                    sb.append("0");
                }
                sb.append(input2);
                input2 = sb.toString();
            }
            sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (input1.charAt(j) == '1' || input2.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
