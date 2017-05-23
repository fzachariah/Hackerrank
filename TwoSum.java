import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

	}

	public int[] twoSum(int[] nums, int target) {

		int ar[] = new int[2];

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			hashMap.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(target - nums[i])) {

				int val = hashMap.get(target - nums[i]);
				if (val != i) {
					ar[0] = val;
					ar[1] = i;
				}

			}
		}
		
		return ar;

	}

}
