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

		String answer = "";

		//#문자 치환
		m = replaceNote(m);

		// 곡정보 배열만큼 반복 
		for (int i = 0; i < musicinfos.length; i++) {
			String[] temp = musicinfos[i].split(",");
			int musicLength = getTime(temp[0], temp[1]); //음악길이 

			temp[3] = replaceNote(temp[3]); // 재생되는곡도  #치
			String playedMusic = "";
			//음악길이만큼 반복해서 재생된음악계
			for (int j = 0; j < musicLength; j++) {
				playedMusic += temp[3].charAt(j % temp[3].length());
			}
			System.out.println("!"+playedMusic);

			//음악찾으면 음악리스트에 곡 추
			if (playedMusic.contains(m)) {
				musicList.add(musicinfos[i]);
			}

		}
		//음악 긴순으로 정
		Collections.sort(musicList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String arr[] = o1.split(",");
				int len1 = getTime(arr[0], arr[1]);
				String arr2[] = o2.split(",");
				int len2 = getTime(arr2[0], arr2[1]);
				
				if(len1<len2)
					return 1;
				else if(len1>len2)
					return -1;
				else 
					return 0;
				
			}

		});

		if (musicList.size() > 0) {
			answer = musicList.get(0).split(",")[2];
		} else
			answer = "(none)";

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
