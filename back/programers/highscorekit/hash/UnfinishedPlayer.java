package highscorekit.hash;

import java.util.Arrays;

public class UnfinishedPlayer {
	public static void main(String[] args) {

		System.out.println(solution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" }));

	}

	public static String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i=0;
		for (; i < completion.length; i++) {
			if (!participant[i].equals(completion[i]))
				return participant[i];

		}

		return participant[i];
	}

}
