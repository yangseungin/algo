package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class back1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			set.add(sc.next());
		}

		String[] arr = new String[set.size()];
		set.toArray(arr);
		Arrays.sort(arr);

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
		});

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}