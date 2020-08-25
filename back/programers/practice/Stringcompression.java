package practice;

public class Stringcompression {
	public static void main(String[] args) {
		System.out.println(solution("abcabcabcabcdededededede"));
	}
	
	public static int solution(String s) {
        int sLen = s.length();
        int minLength = 1000;

        if (s.length() == 1) {
            return 1;
        }

        for (int i = 1; i <= sLen/2; i++) {
            String tmpStr = "";
            String result = "";
            int count = 1;
            for (int j = 0; j < sLen / i; j++) {
                String substring = s.substring((i * j), (i * j) + i);
                if (tmpStr.equals(substring)) {
                    count++;
                    continue;
                }
                if (count > 1) {
                    result += count + tmpStr;
                } else {
                    result += tmpStr;
                }
                tmpStr = substring;
                count = 1;

            }
            if (count > 1) {
                result += count + tmpStr;
            } else {
                result += tmpStr;
            }
            //약수아닌경우 
            if(s.length()%i !=0){
                result+= s.substring(s.length()-(s.length()%i), s.length());
            }

            minLength = Math.min(result.length(), minLength);

        }
        return minLength;
    }

}
