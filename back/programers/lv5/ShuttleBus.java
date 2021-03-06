package lv5;

import java.util.Arrays;

public class ShuttleBus {
	public static void main(String[] args) {
		/*
		 * 셔틀 운행횟수: n - 0 < n <= 10 셔틀 운행간격: t - 0 < t <= 60 한번에 최대 탈수있는 사람수: m
		 * - 0 < m <= 45 사람들이 대기열에 도착하는시각배열 :timetable - 최대 길이 2000 HH:MM 형,
		 * 00:01~23:59
		 * 
		 * 09:00에 도착한 셔틀에 자리있으면 09:00에 줄선 사람도 탈수있 셔틀은 09시부터
		 * 
		 * 
		 * 1. 시간순으로 sort 2. 운행시간마다 탈수있는 최대인원을 체크하여 빼고 3. 다음 버스가없으면 버스시간 정하
		 * 
		 * 
		 * 
		 */

		String[] timetable = { "09:10", "09:09", "08:00" };
		// System.out.println(solution(2, 10, 2, timetable));
		// System.out.println(solution(1, 1, 5, new String[]{"08:00", "08:01",
		// "08:02", "08:03"}));
		// System.out.println(solution(2, 1, 2, new String[]{"09:00", "09:00",
		// "09:00", "09:00"}));
		System.out.println(solution(1, 1, 5, new String[] { "00:01", "00:01", "00:01", "00:01", "00:01" }));
		// System.out.println(solution(1, 1, 1, new String[]{"23:59"}));
		// System.out.println(solution(10, 60, 45, new String[]{"23:59","23:59",
		// "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59",
		// "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));

	}

	public static String solution(int n, int t, int m, String[] timetable) {
		String answer = "";
		String firstBus = "09:00";
		String lastBus = addTime(firstBus, t * (n - 1));
		String tempTime = "";

		String[] arrivalTime = new String[n];

		System.out.println("--------arrivalTime");
		// 도착시간 배열
		for (int i = 0; i < n; i++) {
			arrivalTime[i] = addTime(firstBus, t * i);
		}
		answer = lastBus;
		Arrays.sort(timetable);

		String arriveBus = "";// 현재온 버
		int depart = 0;// 처리된 사람
		int boarderCount = 0; // 매 버스당 탑승객 카운트

		// 버스횟수만큼 반복
		for (int i = 0; i < n; i++) {
			boarderCount = 0;
			arriveBus = arrivalTime[i];

			// 처리됬던사람이후부터 전체사람탐
			for (int j = depart; j < timetable.length; j++) {
				// 현재버스시간보다 빨리왔거나 같은시간에왔고 버스에 자리가있으면 태우고 아니면 break하여 다음버스를 탐(마지막탄사람시간은 체크해둠)
				if (getTime(arriveBus) >= getTime(timetable[j])) {
					if (boarderCount < m) {
						depart++;
						boarderCount++;
						tempTime = timetable[j];
					} else {
						break;
					}
				}
			}
		}
		// 다돌았는데 자리가없으면 마지막탄사람보다 1분빨리
		if (m - boarderCount <= 0) {
			answer = addTime(tempTime, -1);
		}

		return answer;
	}

	public static int getTime(String time) {
		String[] arr = time.split(":");
		int hour = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);

		return hour * 60 + minute;
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
