package page1;

public class ValidSudoku {
	public static void main(String[] args) {
		System.out.println(isValidSudoku(new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } }));
		System.out.println(isValidSudoku(new char[][] { { '.', '.', '.', '.', '5', '.', '.', '1', '.' },
				{ '.', '4', '.', '3', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '3', '.', '.', '1' },
				{ '8', '.', '.', '.', '.', '.', '.', '2', '.' }, { '.', '.', '2', '.', '7', '.', '.', '.', '.' },
				{ '.', '1', '5', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '2', '.', '.', '.' },
				{ '.', '2', '.', '9', '.', '.', '.', '.', '.' }, { '.', '.', '4', '.', '.', '.', '.', '.', '.' } }));

	}

	public static boolean isValidSudoku(char[][] board) {
		// 흐으으으음
		// 구역 나눠서 확인하는것과 가로세로 9칸 확인하는것으로

		for (int i = 0; i < 9; i++) {
			boolean[] sub = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (sub[board[i][j] - '1']) {
						return false;
					}
					sub[board[i][j] - '1'] = true;
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			boolean[] sub = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if (board[j][i] != '.') {
					if (sub[board[j][i] - '1']) {
						return false;
					}
					sub[board[j][i] - '1'] = true;
				}

			}
		}

		// 9칸단위확인
		for (int b = 0; b < 9; b++) {
			boolean[] sub = new boolean[9];
			for (int i = b / 3 * 3; i < b / 3 * 3 + 3; i++) {
				for (int j = b % 3 * 3; j < b % 3 * 3 + 3; j++) {
					if (board[i][j] != '.') {
						if (sub[board[i][j] - '1']) {
							return false;
						}
						sub[board[i][j] - '1'] = true;
					}

				}
			}

		}

		return true;

	}

}
