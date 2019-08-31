package lesson3;

public class FrogJmp {
	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}

	public static int solution(int X, int Y, int D) {
		int result = (Y - X);
		if (result % D == 0)
			return result / D;
		else
			return result / D + 1;
	}
}
