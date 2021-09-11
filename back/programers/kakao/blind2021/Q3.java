package kakao.blind2021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})));
        System.out.println(Arrays.toString(solution(new int[]{120, 0, 60, 591}, new String[]{"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"})));
    }

    public static int[] solution(int[] fees, String[] records) {

        Map<String, String> rec = new HashMap<>();
        Map<String, Long> ans = new HashMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            if (split[2].equals("IN")) {
                rec.put(split[1], split[0]);
            } else {
                ans.put(split[1], ans.getOrDefault(split[1], 0L) + getTimeDiff(rec.get(split[1]), split[0]));
                rec.remove(split[1]);
            }
        }
        //남은거 처리 23:59에 출차되었다고 간주하고 계산
        for (String key : rec.keySet()) {
            ans.put(key, ans.getOrDefault(key, 0L) + getTimeDiff(rec.get(key), "23:59"));
        }
        Object[] objects = ans.keySet().toArray();
        Arrays.sort(objects);
        int[] answer = new int[ans.size()];
        for (int i = 0; i < objects.length; i++) {
            answer[i] = getFee(fees, Math.toIntExact(ans.get(objects[i])));
        }


        return answer;
    }

    public static long getTimeDiff(String start, String end) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(start);
            d2 = format.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return (d2.getTime() - d1.getTime()) / 1000 / 60;
    }

    public static int getFee(int[] fees, int time) {
        if (time <= fees[0]) {
            return fees[1];
        }
        return fees[1] + (int) Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3];
    }
}
