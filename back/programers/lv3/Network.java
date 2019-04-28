package lv3;

public class Network {
	static boolean[] visit = new boolean[200];

	public static void main(String[] args) {

		int n = 3;
		int[][] compusters = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		System.out.println(solution(n, compusters));
	}

	public static void dfs(int start, int[][] computers, int n) {
		visit[start] = true; // 방문한 애들을 true로바꿔주면서

		// 지난주 한솔이형이 말한것 처럼 한쪽만 탐색시 예외케이스가있어서 그냥 전체 탐
		for (int i = 0; i < n; i++) {
			if (!visit[i] && computers[start][i] == 1)
				dfs(i, computers, n);
		}
	}

	public static int solution(int n, int[][] computers) {
		int answer = 0;

		for (int i = 0; i < n; i++) {
			if (!visit[i]) { // 방문한적이 없으면 방문이끝나고 네트워크 증
				dfs(i, computers, n);
				answer++;
			}
		}
		return answer;
	}

}
