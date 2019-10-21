package page2;

public class ExcelSheetColumnTitle {
	public static void main(String[] args) {
		System.out.println(convertToTitle(1));
		System.out.println("==-");
		System.out.println(convertToTitle(28));
		System.out.println("--");
		System.out.println(convertToTitle(701));
	}

	public static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while(n>0){
			n--;
			sb.append((char)(n%26+65));
			n/=26;
		}

		return sb.reverse().toString();
	}
	


}
