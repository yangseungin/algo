package highscorekit.greedy;

public class Joystick {
	public static void main(String[] args) {
		System.out.println(solution("JAN"));

	}

	public static int solution(String name) {
		int answer = 0;
		int lIdx = 0, rIdx = 0, idx = 0;
		String tmp = "";
		for (int i = 0; i < name.length(); i++) {
			tmp += "A";
		}
		System.out.println(tmp);

		
		while (!tmp.equals("name")) {
			lIdx = 1;
			rIdx = 1;

			// 보고있는 인덱스가 값이 다르면 변경
			if (tmp.charAt(idx) != name.charAt(idx)) {

				// 해당값 변
				int cnt = (name.charAt(idx) - 'A' <= 13 ? name.charAt(idx) - 'A' : 91 - name.charAt(idx));
				answer += cnt;
				tmp = tmp.substring(0, idx) + name.charAt(idx) + tmp.substring(idx + 1);
				System.out.println("해당인덱스 값 변경끝 " + tmp);
			}

			// 값 변경후 변경할값이랑 같으면 break;
			if (tmp.equals(name))
				break;
			else {
				// 좌우 이동하는 값 선택
				for (int i = 1; i < name.length(); i++) {
					if (name.charAt(idx + i > name.length() - 1 ? Math.abs(name.length() - (i + idx)) : idx + i) == 'A') 
						rIdx += 1;
					else
						break;
					

					if (name.charAt(idx - i < 0 ? name.length() - Math.abs(idx - i) : idx - i) == 'A') 
						lIdx += 1;
					else
						break;
					
					// 1씩더하는게아니고 i씩더해야할거같은데 그리고 더하고낫 for문나가기전 lidx ridx가 0 이아니면
					// brea를 추가해야할

				}
				if (rIdx > lIdx) {
					answer += lIdx;
					idx = idx - lIdx < 0 ? tmp.length() - Math.abs(idx - lIdx) : idx - lIdx;
				} else {
					answer += rIdx;
					idx = idx + rIdx > tmp.length() - 1 ? Math.abs(tmp.length() - (idx + rIdx)) : idx + rIdx;
				}

			}


		}

		return answer;
	}

}
