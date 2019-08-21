package page1;

public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(5));

	}

	public static String countAndSay(int n) {
		if (n < 1)
			return null;

		String result = "1";
		for (int i = 1; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();

		}

		return result;
	}

}
