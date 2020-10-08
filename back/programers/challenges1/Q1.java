package challenges1;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(solution(45));
//        System.out.println(solution(125));

    }

    public static int solution(int n) {
        int answer = 0;
        String tmp = new StringBuilder(change(n)).reverse().toString();
        int idx = 0;
        for (int i = tmp.length() - 1; i >= 0; i--) {
            answer = answer + (tmp.charAt(i) - 48) * (int) Math.pow(3, idx);
            idx++;
        }

        return answer;
    }

    public static String change(int n) {
        int pos = 3;
        String res = "";
        while (n != 0) {
            if ((n % pos) < 10) {
                res = (n % pos) + res;
                n /= pos;
            } else {
                int temp1 = (char) ((n % pos) + 55);

                res = Integer.toString(temp1) + res;
            }
        }
        return res;
    }

}
