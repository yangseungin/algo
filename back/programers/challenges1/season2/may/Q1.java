package challenges1.season2.may;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int count = getCount(i);
            answer += count % 2 == 0 ? i : -i;
        }

        return answer;
    }

    public static int getCount(int num) {
        int count=0;
        for (int i = 1; i <= num ; i++) {
            if(num%i==0){
                count++;
            }
        }
        return count;
    }

}
