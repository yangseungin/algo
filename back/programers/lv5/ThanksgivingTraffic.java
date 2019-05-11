package lv5;

public class ThanksgivingTraffic {
	public static void main(String[] args) {

		String[] lines = { "2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s",
				"2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s",
				"2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s",
				"2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s" };

		System.out.println(solution(lines));

	}

	public static int solution(String[] lines) {
		int answer = 0;

		String[] times = new String[lines.length];
		int[] sections = new int[lines.length];

		double endTime;
		double consumeTime;
		double section;

		for (int i = 0; i < lines.length; i++) {
			times[i] = lines[i].substring(11).replace(":", "").replace("s", "");

			int totalSec = (Integer.parseInt(times[i].substring(0, 2)) * 3600
					+ Integer.parseInt(times[i].substring(2, 4)) * 60) + Integer.parseInt(times[i].substring(4, 6));
			times[i] = "" + totalSec + times[i].substring(6);

		}
		//
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
			String[] split = times[i].split("\\s");

			endTime = Double.parseDouble(split[0]); // 완료시간
			consumeTime = Double.parseDouble(split[1]); // 처리시간
			section = endTime + 1; // 구간(1초)

			for (int j = i; j < times.length; j++) {
				split = times[j].split("\\s");
				endTime = Double.parseDouble(split[0]); // 완료시간
				consumeTime = Double.parseDouble(split[1]); // 처리시간

				double tmp = endTime - consumeTime + 0.001;

				if (tmp < section)
					sections[i]++;

			}
			if (answer < sections[i])
				answer = sections[i];
		}

		return answer;
	}

}
