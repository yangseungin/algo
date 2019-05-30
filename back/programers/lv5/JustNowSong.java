package lv5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JustNowSong {
	public static void main(String[] args) {
		//System.out.println(solution("ABCDEFG", new String[] { "12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF" }));
		// System.out.println(solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B" }));
		 System.out.println(solution("ABC", new String[]{ "12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF" }));

	}

	public static String solution(String m, String[] musicinfos) {
		ArrayList<String> musicList = new ArrayList<String>();

		String answer = "(None)";
		int time=0;

		//#문자 치환
		m = replaceNote(m);

		// 곡정보 배열만큼 반복 
		for (int i = 0; i < musicinfos.length; i++) {
			String[] temp = musicinfos[i].split(",");
			int musicLength = getTime(temp[0], temp[1]); //음악길이 

			temp[3] = replaceNote(temp[3]); // 재생되는곡도  #치환 
			String playedMusic = "";
			
			if(musicLength>time){
				for (int j = 0; j < musicLength; j++) {
					playedMusic += temp[3].charAt(j % temp[3].length());
				}
				if (playedMusic.contains(m)) {
					answer=temp[2];
					time=musicLength;
				}
				
				
			}
			
			
			//음악길이만큼 반복해서 재생된음악계
			System.out.println("!"+playedMusic);

			//음악찾으면 음악리스트에 곡 추
			

		}


		return answer;
	}

	public static int getTime(String start, String end) {
		String[] temp = start.split(":");
		int startTime = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
		temp = end.split(":");
		int endTime = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

		return Math.abs(endTime - startTime);
	}

	public static String replaceNote(String str) {
		return str.replace("C#", "c").replace("D#", "d").replace("F#", "f").replace("G#", "g").replace("A#", "a");

	}

}
