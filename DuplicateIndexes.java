import java.util.HashMap;

public class DuplicateIndexes {

	public static void main(String args[]) {

		int ar[] = { 2147483647, -2147483648, 2147483647, -2147483648 };
		System.out.println(containsNearbyDuplicate(ar, 2));

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		boolean check = false;

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				if (i - hashMap.get(nums[i]) <= k) {
					check = true;
					break;
				}
				else
				{
					hashMap.put(nums[i], i);
				}
			}
			else
			{
				hashMap.put(nums[i], i);
			}

		}

		return check;

	}

}
