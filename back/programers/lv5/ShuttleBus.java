package lv5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class ShuttleBus {
	public static void main(String[] args) {
		/*
		 * 셔틀 운행횟수: n - 0 < n <= 10 셔틀 운행간격: t - 0 < t <= 60 한번에 최대 탈수있는 사람수: m
		 * - 0 < m <= 45 사람들이 대기열에 도착하는시각배열 :timetable - 최대 길이 2000 HH:MM 형,
		 * 00:01~23:59
		 * 
		 * 09:00에 도착한 셔틀에 자리있으면 09:00에 줄선 사람도 탈수있 셔틀은 09시부터
		 */

		int n = 2, t = 10, m = 2;
		String[] timetable = { "09:10", "09:09", "08:00" };
		System.out.println("test addtime: " + addTime("09:00", 10));
		System.out.println(solution(n, t, m, timetable));

	}

	public static String solution(int n, int t, int m, String[] timetable) {
		String str = "";
		String[] arrivalTime = new String[n];

		System.out.println("--------arrivalTime");
		// 도착시간 배열
		for (int i = 0; i < n; i++) {
			arrivalTime[i] = addTime("09:00", t * i);
			System.out.println(arrivalTime[i]);
		}

		Arrays.sort(timetable);
		System.out.println("--------timetable");
		for (int i = 0; i < timetable.length; i++) {
			System.out.println(timetable[i]);
		}

		return str;
	}

	public static String addTime(String time, int addtime) {
		String[] arr = time.split(":");
		int hour = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);
		int temp = hour * 60 + minute + addtime;

		hour = temp / 60;
		minute = temp % 60;

		return String.format("%02d", hour) + ":" + String.format("%02d", minute);
	}

}
