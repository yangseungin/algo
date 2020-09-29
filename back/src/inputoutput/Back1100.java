package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int SIZE = 8;
        char[][] board = new char[SIZE][SIZE];
        String line;
        int cnt = 0;
        for (int i = 0; i < SIZE; i++) {
            line = br.readLine();
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = line.charAt(j);
                if ((i + j) % 2 == 0 && board[i][j] == 'F')
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
