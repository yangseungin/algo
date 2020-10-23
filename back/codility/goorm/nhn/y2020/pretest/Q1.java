package goorm.nhn.y2020.pretest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    private static int cnt = 1;
    private static int[] X = {-1, 0, 1, 0};
    private static int[] Y = {0, 1, 0, -1};

    public static void main(String[] args) {
        InputData inputData = processStdin();
        solution(inputData.sizeOfMatrix, inputData.matrix);
    }

    private static void solution(int sizeOfMatrix, int[][] matrix) {
        boolean[][] check = new boolean[matrix.length][matrix[0].length];
        List<Integer> list = new ArrayList<>();
        // TODO: 이곳에 코드를 작성하세요.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    dfs(i, j, check, matrix);
                    list.add(cnt);
                    cnt = 1;
                } else
                    continue;
            }
        }
        System.out.println(list.size());
        if (list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++)
                sb.append(list.get(i) + " ");
            System.out.println(sb);
        }

    }

    public static void dfs(int x, int y, boolean[][] check, int[][] matrix) {
        check[x][y] = true;
        matrix[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nextX = x + X[i];
            int nextY = y + Y[i];
            if (nextX < 0 || nextY < 0 || nextX >= check.length || nextY >= check.length)  //범위 벗어남
                continue;
            if (check[nextX][nextY]) //이미 방문
                continue;
            if (matrix[nextX][nextY] == 0) {
                check[nextX][nextY] = true;
                continue;
            }
            dfs(nextX, nextY, check, matrix);
            cnt++;
        }

    }

    private static class InputData {
        int sizeOfMatrix;
        int[][] matrix;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
            for (int i = 0; i < inputData.sizeOfMatrix; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.sizeOfMatrix; j++) {
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }
}
