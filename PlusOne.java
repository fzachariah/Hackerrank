
public class PlusOne {

	public static void main(String[] args) {

		int ar[] = { 8, 9, 9, 9 };
		System.out.println(plusOne(ar));

	}

	public static int[] plusOne(int[] digits) {

		if (digits.length == 1 && digits[0] != 9) {
			digits[0] = digits[0] + 1;
			return digits;
		}
		boolean sum1 = true;

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 9) {
				sum1 = false;
				break;
			}
		}
		System.out.println(sum1);
		if (sum1) {
			int[] newArray = new int[(digits.length) + 1];
			newArray[0] = 1;
			for (int j = 1; j < newArray.length; j++) {
				newArray[j] = 0;
			}

			return newArray;
		} else {
			int sum = 0;
			int[] newArray = new int[(digits.length)];
			int rem = 0;
			for (int i = digits.length - 1; i >= 0; i--) {
				if (i == digits.length - 1) {
					sum = rem + digits[i] + 1;
					if (sum > 9) {
						rem = 1;
						sum = sum % 10;
					} else {
						rem = 0;
					}
					newArray[i] = sum;
				} else {
					sum = rem + digits[i];
					if (sum > 9) {
						rem = 1;
						sum = sum % 10;
					} else {
						rem = 0;
					}
					newArray[i] = sum;
				}
			}
			return newArray;
		}

	}

}
