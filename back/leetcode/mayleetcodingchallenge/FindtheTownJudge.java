package mayleetcodingchallenge;

public class FindtheTownJudge {
	public static void main(String[] args) {
		System.out.println(findJudge(2, new int[][] { { 1, 2 } }));
	}

	public static int findJudge(int N, int[][] trust) {
		int[] arr = new int[N + 1];
		for (int[] person : trust) {
			arr[person[0]]--;
			arr[person[1]]++;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == N - 1) {
				return i;
			}
		}
		return -1;
	}

}
