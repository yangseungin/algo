package kakao.blind2021;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
//        System.out.println(solution(437674, 3));
        System.out.println(solution(110011, 10));

    }

    public static int solution(int n, int k) {
        int answer = 0;
        String convertedNumber = getKConversion(n, k);
        String[] split = convertedNumber.split("0");
        System.out.println(Arrays.toString(split));
        for(String str:split){
            if(!str.equals("") &&isPrime(str)){
                answer++;
            }
        }


        return answer;
    }

    public static int solution2(int n, int k) {
        int answer = 0;
        String convertedNumber = getKConversion(n, k);

//        System.out.println(isPrime("12"));
        //P
//        if(isPrime(convertedNumber)){
//            answer++;
//        }

        // P0
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < convertedNumber.length(); i++) {
            if (convertedNumber.charAt(i) == '0') {
                break;
            }
            sb.append(convertedNumber.charAt(i));
        }
        if (isPrime(sb.toString())) {
            answer++;
        }
        //0P
        sb = new StringBuilder();
        for (int i = convertedNumber.length() - 1; i >= 0; i--) {
            if (convertedNumber.charAt(i) == '0') {
                break;
            }
            sb.append(convertedNumber.charAt(i));
        }
//        System.out.println(sb);
        if (isPrime(sb.toString())) {
            answer++;
        }

//        0P0
        for (int i = 0; i < convertedNumber.length(); i++) {
            if (convertedNumber.charAt(i) == '0') {
                sb = new StringBuilder();
                boolean isLast = false;
                for (int j = i + 1; j < convertedNumber.length(); j++) {
                    if (convertedNumber.charAt(j) == '0') {
                        break;
                    }
                    sb.append(convertedNumber.charAt(j));
                    if (j == convertedNumber.length() - 1) {
                        isLast = true;
                    }

                }
                if (!sb.toString().equals("") && isPrime(sb.toString()) && !isLast) {
                    answer++;
                }

            }

        }

        return answer;
    }

    public static String getKConversion(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            if (n % k < 10) {
                sb.append(n % k);
            }
            n /= k;
        }
        return sb.reverse().toString();

    }

    public static boolean isPrime(String str) {
        long num = Long.parseLong(str);
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
