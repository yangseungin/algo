package lv2;

import java.util.Arrays;

public class lifeBoat {
	public static void main(String[] args) {
		/*
		 * 이문제는 음 탐욕법이라 적혀있어서 탐욕으로 일단 풀어야는디 하나씩 더하면서 100보다작으면 반복 커지면 answer++ ->
		 * 문제 제대로안읽음 구명보트는 최대2명까지
		 * 소팅해서 젤작은것과 큰것을 더해 100보다 크면 answer증
		 * 아아ㅏㅏ앙아ㅏ아아아아아아아 limit으로안주고 100주고해서 계속틀렸음...
		 */

		int[] people = { 70, 50, 80, 50 };
		int limit = 100;
		System.out.println(solution(people, limit));

	}

	public static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);
		int i=0,j=0;
		for ( j=people.length - 1; i < j; j--) {
			if (people[i] + people[j] > limit) {
				answer++;
			}else{
				answer++;
				i++;
			}

		}
		if(i==j)
			answer++;
		return answer;
	}
}
