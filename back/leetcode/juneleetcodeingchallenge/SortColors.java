package juneleetcodeingchallenge;

public class SortColors {
	public void sortColors(int[] nums) {
		int[] tmp = new int[3];
		int idx = 0;
		for (int i : nums) {
			tmp[i]++;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < tmp[i]; j++, idx++) {
				nums[idx] = i;
			}
		}
	}

}
