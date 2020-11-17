package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int res = 0;

        String[] str = line.split("-");

        for (String tmp : str[0].split("[+]"))
            res += Integer.parseInt(tmp);


        for (int i = 1; i < str.length; i++)
            for (String tmp : str[i].split("[+]"))
                res -= Integer.parseInt(tmp);

        System.out.println(res);
    }
}
