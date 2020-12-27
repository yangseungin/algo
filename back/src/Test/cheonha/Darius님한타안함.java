package Test.cheonha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Darius님한타안함 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split("/");
        int K=Integer.parseInt(split[0]),D=Integer.parseInt(split[1]),A=Integer.parseInt(split[2]);
        if(K+A<D || D==0)
            System.out.println("hasu");
        else
            System.out.println("gosu");
    }
}
