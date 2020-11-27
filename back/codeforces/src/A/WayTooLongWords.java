package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if(input.length()>10){
                System.out.print(input.charAt(0));
                System.out.print(input.length()-2);
                System.out.println(input.charAt(input.length()-1));
            }else {
                System.out.println(input);
            }
        }

    }
}
