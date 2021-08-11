package weeklychallenge;

public class 상호평가 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}}));
    }

    public static String solution(int[][] scores) {
        int length = scores.length;
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < length; j++) {
            int score = scores[j][j];
            double sum = 0;
            boolean isHigh = true;
            boolean isLow = true;
            boolean isEqual = false;
            for (int i = 0; i < length; i++) {
                sum += scores[i][j];
                if (score > scores[i][j]) {
                    isHigh = false;
                } else if (score < scores[i][j]) {
                    isLow = false;
                }
                if (i != j && score == scores[i][j]) {
                    isEqual = true;
                }
            }
            int count = length;
            if (!isEqual && (isHigh || isLow)) {
                sum -= score;
                count--;
            }
            double average = sum / count;
            if (average >= 90) {
                sb.append('A');
            } else if (average >= 80) {
                sb.append('B');
            } else if (average >= 70) {
                sb.append('C');
            } else if (average >= 50) {
                sb.append('D');
            } else {
                sb.append('F');
            }

        }
        return sb.toString();
    }
}
