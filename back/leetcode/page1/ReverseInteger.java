package page1;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {
		long tmp = 0;
		boolean minus = false;
		if (x == 0)
			return (int) tmp;
		else if (x < 0) {
			x = -x;
			minus = true;
		}

		while (x > 0) {
			tmp = tmp * 10 + x % 10;
			x /= 10;
			System.out.println(tmp+" / "+Integer.MAX_VALUE+" / "+Integer.MIN_VALUE);
			if(tmp>Integer.MAX_VALUE||tmp<Integer.MIN_VALUE)
				return 0;

		}
		if (minus) {
			return (int) -tmp;
		}

		return (int) tmp;
	}

}
