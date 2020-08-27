package practice;

import java.util.Arrays;

public class LockAndKey {
	static int oriLockLen;
	static int oriKeyLen;

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } },
				new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } }));
	}
	public static boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        oriKeyLen = key.length;
        oriLockLen = lock.length;


        int[][] expandLock = createExpandLock(lock, key.length);

        for (int dir = 0; dir < 4; dir++) {
            if (dir != 0) {
                key = rotate(key); // 키회전
            }

            for (int i = 0; i < expandLock.length - key.length; i++) {
                for (int j = 0; j < expandLock.length - key.length; j++) {
                    if (checkLock(i, j, key, expandLock)) {
                        return true;
                    }
                }
            }
        }


        return answer;
    }

    public static boolean checkLock(int x, int y, int[][] key, int[][] expandLock) {
        int[][] copyLock = new int[expandLock.length][expandLock.length];
        for (int i = 0; i < copyLock.length; i++) {
            copyLock[i] = expandLock[i].clone();
        }
        System.out.println("----------ㅅ");
        printK(key);
        printK(copyLock);
        System.out.println("----------ㄷ");
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                if (key[i][j] == 1) {
                    if (expandLock[x + i][y + j] == 1) {
                        return false;
                    }
                    copyLock[x + i][y + j] = key[i][j];
                }

            }
        }


        return false;
    }

    public static int[][] createExpandLock(int[][] lock, int keysize) {
        int[][] expandLock = new int[lock.length + (keysize - 1) * 2][lock.length + (keysize - 1) * 2];


        for (int i = keysize - 1, x = 0; i < keysize - 1 + lock.length; i++) {
            for (int j = keysize - 1, y = 0; j < keysize - 1 + lock.length; j++) {
                expandLock[i][j] = lock[x][y++];
//                System.out.print(expandLock[i][j]);
            }
            x++;
//            System.out.println();
        }
        for (int i = 0; i < expandLock.length; i++)
            System.out.println(Arrays.toString(expandLock[i]));


        return expandLock;
    }

    public static int[][] rotate(int[][] key) {
        int[][] rotatedArr = new int[key.length][key.length];
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                rotatedArr[i][j] = key[key.length - 1 - j][i];
            }
        }

        return key;
    }

    public static void printK(int[][] key) {
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[i].length; j++) {
                System.out.print(key[i][j]);
            }
            System.out.println();
        }

    }
}
