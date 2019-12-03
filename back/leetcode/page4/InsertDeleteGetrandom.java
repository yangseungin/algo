package page4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetrandom {
	public static void main(String[] args) {

		InsertDeleteGetrandom randomSet = new InsertDeleteGetrandom();

		// Inserts 1 to the set. Returns true as 1 was inserted successfully.
		randomSet.insert(1);

		// Returns false as 2 does not exist in the set.
		randomSet.remove(2);

		// Inserts 2 to the set, returns true. Set now contains [1,2].
		randomSet.insert(2);

		// getRandom should return either 1 or 2 randomly.
		randomSet.getRandom();

		// Removes 1 from the set, returns true. Set now contains [2].
		randomSet.remove(1);

		// 2 was already in the set, so return false.
		randomSet.insert(2);

		// Since 2 is the only number in the set, getRandom always return 2.
		randomSet.getRandom();
		
	}

	/** Initialize your data structure here. */
	List<Integer> list;

	public InsertDeleteGetrandom() {
		list = new ArrayList<>();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already
	 * contain the specified element.
	 */
	public boolean insert(int val) {
		if (list.contains(val)) {
			return false;
		} else {
			list.add(val);
			return true;
		}
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the
	 * specified element.
	 */
	public boolean remove(int val) {
		if (list.contains(val)) {
			list.remove(Integer.valueOf(val));
			return true;
		} else {
			return false;
		}
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Random rand = new Random();
		return list.get(rand.nextInt(list.size()));
	}

}
