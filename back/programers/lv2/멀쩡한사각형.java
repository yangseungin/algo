package lv2;

public class 멀쩡한사각형 {
    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }

    public static long solution(int w, int h) {
        long answer = 0;
        for (int i = 0; i < w; i++)
            answer += (Long.valueOf(h) * i) / Long.valueOf(w);
        return answer * 2;
    }
}
