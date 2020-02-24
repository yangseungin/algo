package page7;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar1 {
	List<int[]> calendar;

	public MyCalendar1() {
		// TODO Auto-generated constructor stub
		calendar = new ArrayList();

	}

	public boolean book(int start, int end) {
		for (int[] cal : calendar) {
			if (cal[0] < end && start < cal[1]) {
				return false;
			}
		}
		calendar.add(new int[] { start, end });

		return true;
	}

}
