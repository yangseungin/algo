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
		
		 if(name.charAt(0) != 'A') {
	        	int cnt = (name.charAt(0) - 'A' <= 13? name.charAt(0) - 'A' : 91 - name.charAt(0));
	        	answer += cnt;
				tmp = tmp.substring(0, idx) + name.charAt(idx) + tmp.substring(idx + 1);
				idx = 1;
	    }

		while (!tmp.equals("name")) {
			lIdx = 0;
			rIdx = 0;

			if (tmp.charAt(idx) != name.charAt(idx)) {

				// 해당값 변
				int cnt = (name.charAt(idx) - 'A' <= 13 ? name.charAt(idx) - 'A' : 91 - name.charAt(idx));
				System.out.println("더할숫자는: " + cnt);
				answer += cnt;
				tmp = tmp.substring(0, idx) + name.charAt(idx) + tmp.substring(idx + 1);
				System.out.println("해당인덱스 값 변경끝 " + tmp);
			}
			
				// 값 변경후 변경할값이랑 같으면 break;
				if (tmp.equals(name))
					break;
				else{
					// 좌우 이동하는 값 선택
					for (int i = 1; i < name.length(); i++) {
						if (tmp.charAt(idx + i > tmp.length() - 1 ? Math.abs(tmp.length() - (i + idx)) : idx + i) == 'A') {
							System.out.println("오른쪽A찾");
							rIdx+=1;
						}

						if (tmp.charAt(idx - i < 0 ? tmp.length() - Math.abs(idx - i) : idx - i) != 'A') {
							lIdx+=1;
						}
						// 1씩더하는게아니고 i씩더해야할거같은데 그리고 더하고낫 for문나가기전 lidx ridx가 0 이아니면
						// brea를 추가해야할

					}
					System.out.println(lIdx +" / "+rIdx);
					if (lIdx > rIdx) {
						answer += rIdx;
						idx -= rIdx;
						idx = idx - lIdx < 0 ? tmp.length() - Math.abs(idx - lIdx) : idx - lIdx;
					} else {
						answer += lIdx;
						idx += lIdx;
					}
					System.out.println("좌우 방향선택  " + (idx > 0 ? "양수" : "음수 "));
					
					
					
					
					
					
				}
				
				
				

			

			// break;
			/*
			 * if (!String.copyValueOf(rarr).equals(name)) { rcnt++; if
			 * (name.charAt(i) - 'A' <= 13) rcnt += name.charAt(i) - 'A'; else
			 * rcnt += 91 - name.charAt(i); rarr[i] = name.charAt(i); }
			 * 
			 * if (!String.copyValueOf(larr).equals(name) && j > 0) { lcnt++; if
			 * (name.charAt(j) - 'A' <= 13) lcnt += name.charAt(j) - 'A'; else
			 * lcnt += 91 - name.charAt(j); larr[j] = name.charAt(j); }
			 */

		}

		return answer;
	}

}
