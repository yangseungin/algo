package challenges1.season3;

public class Q1 {
    public static void main(String[] args) {
        System.out.println();

    }

    public int solution(int[] numbers) {
        int answer = 45;
        for (int num : numbers) {
            answer -= num;
        }
        return answer;
    }
}
