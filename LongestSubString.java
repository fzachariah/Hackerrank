import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {

	public static void main(String args[]) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int highest = Integer.MIN_VALUE;
		if (s.length() > 1) {
			String longest = "";
			//HashSet<String> hashSet = new HashSet<>();
			for (int i = 0; i < s.length(); i++) {
				String val = "" + s.charAt(i);
				if (!longest.contains(val)) {
					//hashSet.add(val);
					longest = longest + val;

					if (highest < longest.length()) {
						highest = longest.length();
					}
				} else {
					if (highest < longest.length()) {
						highest = longest.length();
					}
					if (longest.indexOf(val) + 1 == longest.length()) {
						longest = "" + val;
						
					} else {
						longest = longest.substring(longest.indexOf(val) + 1);
						longest = longest + val;
					}

				}
			}

			if (highest == Integer.MIN_VALUE && longest.length() != 0) {
				highest = longest.length();
			}

		} else if (s.length() == 1) {
			highest = 1;
		} else {
			highest = 0;
		}
		return highest;
	}

}
