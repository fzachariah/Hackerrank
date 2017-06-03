
public class FindMissing {

	public static void main(String args[]) {
		int[] nums = { 1, 0 };
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {

		boolean check = false;
		int sumOne = 0;
		for (int i = 0; i < nums.length; i++) {
			sumOne = sumOne + nums[i];

			if (nums[i] == 0) {
				check = true;
			}
		}

		if (!check) {
			return 0;
		}

		int sum = (nums.length * (nums.length + 1)) / 2;

		/*
		 * System.out.println(sum); System.out.println(nums[0]);
		 */

		return (sum - sumOne);

	}

}
