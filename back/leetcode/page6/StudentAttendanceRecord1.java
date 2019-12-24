package page6;

public class StudentAttendanceRecord1 {
	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLP"));
	}

	public static boolean checkRecord(String s) {
		if (s.contains("LLL")) {
			return false;
		}
		int aCount=0;
		for (char c : s.toCharArray()) {
			if (c == 'A') {
				aCount++;
				if(aCount==2){
					return false;
				}
			}
		}
		return true;
	}
}
