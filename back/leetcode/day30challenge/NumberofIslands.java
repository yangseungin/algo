package day30challenge;

public class NumberofIslands {
	public static void main(String[] args) {
		System.out.println(numIslands(new char[][] { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' },
				{ '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } }));
	}

	public static int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		int result = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					result += dfs(grid, i, j);
				}
			}
		}

		return result;
	}

	public static int dfs(char[][] grid, int i, int j) {
		print(grid);
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
			return 0;
		}
		grid[i][j] = '0';
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);

		return 1;
	}

	public static void print(char[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
	}

}
