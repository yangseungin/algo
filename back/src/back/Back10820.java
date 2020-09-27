package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        String line;
        int[] result;
        while ((line = br.readLine()) != null) {
            result = new int[4];
            sb = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) >='a' && line.charAt(i)<='z')
                    result[0]++;
                else if(line.charAt(i) >='A' && line.charAt(i) <='Z')
                    result[1]++;
                else if(line.charAt(i)>='0' && line.charAt(i)<='9')
                    result[2]++;
                else if(line.charAt(i)==' ')
                    result[3]++;
            }
            for(int i:result)
                sb.append(i).append(" ");
            System.out.println(sb.toString());
        }
    }
}
