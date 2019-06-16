package highscorekit.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DiskController {
	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 0, 3 }, { 1, 9 }, { 2, 6 } }));

	}

	public static int solution(int[][] jobs) {
		int answer = 0;

		Arrays.sort(jobs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1] - o2[1];
			}
		});

		ArrayList<Disk> list = new ArrayList<Disk>();

		for (int i = 0; i < jobs.length; i++) {
			System.out.println(Arrays.toString(jobs[i]));
			list.add(new Disk(jobs[i][0], jobs[i][1]));
		}

		int time = 0;
		while (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (time >= list.get(i).startTime) {
					time += list.get(i).workTime;
					answer += time - list.get(i).startTime;
					list.remove(i);
					break;
				}

				if (i == list.size() - 1)
					time++;
			}
		}

		return answer / jobs.length;
	}

	static class Disk {
		int startTime;
		int workTime;

		public Disk(int startTime, int workTime) {
			this.startTime = startTime;
			this.workTime = workTime;
		}
	}

}
