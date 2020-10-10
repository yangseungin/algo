package dev;

import java.time.LocalTime;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(solution("PM 01:00:00",10));
    }
    public static String solution(String p, int n) {
        String answer = "";
        String[] s = p.split(" ");
        StringTokenizer st = new StringTokenizer(s[1], ":");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        LocalTime time = LocalTime.of(hour,min,sec).plusSeconds(n);
        if(s[0].equals("PM")){
            time = time.plusHours(12);
        }
//        System.out.println(time);
//        answer=time.toString();
        answer+=time.getHour()<10?"0"+ time.getHour()+":":time.getHour()+":";
        answer+=time.getMinute()<10?"0"+ time.getMinute()+":":time.getMinute()+":";
        answer+=time.getSecond()<10?"0"+ time.getSecond():time.getSecond();

        return answer;
    }

}
