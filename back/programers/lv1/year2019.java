package lv1;

public class year2019 {
	public static void main(String[] args) {
		System.out.println(solution(5,24));
		
	}
	 public static String solution(int a, int b) {
	      int daySum=0;
	      int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
	      String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	      
	      for(int i=0;i<a-1;i++){
	    	  daySum += month[i];
	      }
	      daySum += b-1;
	      
	      
	      
	      return day[daySum%7];
	  }
}
