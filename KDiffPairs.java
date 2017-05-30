import java.util.HashMap;

public class KDiffPairs {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		System.out.println(findPairs(ar, -1));
	}

	public static int findPairs(int[] nums, int k) {

		int count = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {

			hashMap.put(nums[i], i);
		}
		if (k > 0) {
			for (int i = 0; i < nums.length; i++) {
				if (hashMap.containsKey(nums[i])) {

					int valOne = nums[i] + k;
					int valTwo = nums[i] - k;

					if (hashMap.containsKey(valOne)) {
						count++;
					}
					if (hashMap.containsKey(valTwo)) {
						count++;
					}

					hashMap.remove(nums[i]);
				}
			}
		} else if (k == 0) {
			for (int i = 0; i < nums.length; i++) {

				if (hashMap.containsKey(nums[i]) && hashMap.get(nums[i]) != i) {
					hashMap.remove(nums[i]);
					count++;
				}

			}

		}

		return count;
	}

}
