package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x=Integer.parseInt(s[0]), y=Integer.parseInt(s[1]), w=Integer.parseInt(s[2]), h=Integer.parseInt(s[3]);
        System.out.println(Math.min(Math.min(x-0,w-x),Math.min(y-0,h-y)));

    }
}
