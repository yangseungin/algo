package page5;

public class LicenseKeyFormatting {
	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
	}

	public static String licenseKeyFormatting(String S, int K) {
		StringBuilder sb = new StringBuilder();
		sb.append(S.toUpperCase().replace("-", ""));
		int counter = 0;
		for (int i = sb.length(); i > 0; i--) {
			if (counter == K) {
				sb.insert(i, "-");
				counter = 0;
			}
			counter++;
		}

		return sb.toString();
	}
}
