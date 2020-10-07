package deque;

import java.util.ArrayList;
import java.util.Scanner;

public class Back10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int N = sc.nextInt();
		String line = "";
		for (int i = 0; i <= N; i++) {
			line = sc.nextLine();

			if (line.contains("push_back")) {
				list.add(list.size(), Integer.parseInt(line.substring(10, line.length())));
			} else if (line.contains("push_front")) {
				list.add(0, Integer.parseInt(line.substring(11, line.length())));
			} else if (line.equals("pop_front")) {
				if (list.size() == 0)
					System.out.println(-1);
				else {
					System.out.println(list.get(0));
					list.remove(0);
				}

			} else if (line.equals("pop_back")) {
				if (list.size() == 0)
					System.out.println(-1);
				else {
					System.out.println(list.get(list.size() - 1));
					list.remove(list.size() - 1);
				}

			} else if (line.equals("size"))
				System.out.println(list.size());
			else if (line.equals("empty")) {
				if (list.size() == 0)
					System.out.println(1);
				else
					System.out.println(0);
			} else if (line.equals("front")) {
				if (list.size() == 0)
					System.out.println(-1);
				else
					System.out.println(list.get(0));
			} else if (line.equals("back")) {
				if (list.size() == 0)
					System.out.println(-1);
				else
					System.out.println(list.get(list.size() - 1));
			}

		}

	}

}
