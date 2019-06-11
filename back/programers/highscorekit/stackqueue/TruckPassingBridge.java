package highscorekit.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingBridge {
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int[] { 7, 4, 5, 6 }));
		// System.out.println(solution(100,100,new int[]{10}));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Truck> before = new LinkedList<Truck>();
		Queue<Truck> after = new LinkedList<Truck>();
		Truck[] trucks = new Truck[truck_weights.length];

		for (int i = 0; i < truck_weights.length; i++) {
			trucks[i] = new Truck(bridge_length, truck_weights[i]);
			before.offer(trucks[i]);

		}
		

		int onBridge = 0;
		onBridge += before.peek().weight;
		after.offer(before.poll());
		answer++;
		while (!after.isEmpty()) {
			for (Truck truck : after) {
				truck.time--;
			}

			if (after.peek().time == 0)
				onBridge -= after.poll().weight;

			if (!before.isEmpty() && weight >= onBridge + before.peek().weight) {
				onBridge += before.peek().weight;
				after.offer(before.poll());
			}
			answer++;
			/*System.out.println("총무게" + onBridge);
			System.out.println("경과시간" + answer);
			System.out.println("다리위트럭"+after.size());
			System.out.println("=============================");*/
		}

		return answer;
	}

	static class Truck {
		int time;
		int weight;

		public Truck(int time, int weight) {
			this.time = time;
			this.weight = weight;
		}
	}

}
