package lv5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ShuttleBus {
	public static void main(String[] args) {
		/*
		셔틀 운행횟수: n						- 0 < n <= 10
		셔틀 운행간격: t						- 0 < t <= 60
		한번에 최대 탈수있는 사람수: m				- 0 < m <= 45
		사람들이 대기열에 도착하는시각배열 :timetable - 최대 길이 2000 HH:MM 형, 00:01~23:59
		
		09:00에 도착한 셔틀에 자리있으면 09:00에 줄선 사람도 탈수있
		셔틀은 09시부터 
	*/
		
		
		
		
		int n=2, t=10, m=2;
		String[] timetable={"09:10", "09:09", "08:00"};
		System.out.println(solution(n,t,m,timetable));
		
	}
	public static String solution(int n, int t, int m, String[] timetable){
		String str="";
		DateFormat df = new SimpleDateFormat("HH:mm");
	    try {
	        Date date;
	        Calendar cal;
			cal = Calendar.getInstance();
			
			for(int i=0;i<timetable.length;i++){  
				System.out.println(timetable[i]);
				date = df.parse(timetable[i]);

		        // 날짜 더하기
		        cal.setTime(date);
		        cal.add(Calendar.HOUR, 1);
		        cal.add(Calendar.MINUTE, 2);
		         
		        System.err.println(df.format(cal.getTime()));
			
			}
	         
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
		
		
		
		return str;
	}

}
