package page5;

public class NumberofSegmentinaString {
	public static void main(String[] args) {
		System.out.println(countSegments(", , , ,        a, eaefa"));
	}

	public static int countSegments(String s) {
		s = s.trim();
        if (s.equals("")) {
            return 0;
        }
        return s.split("\\s+").length;
	}

}
