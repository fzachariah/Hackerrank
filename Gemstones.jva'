import java.util.Scanner;
class Solution
    {
    	public static void main(String args[]) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = new String();
			str[i] = sc.nextLine();

		}
		
		
		char[] temp = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int[] counter = new int[26];
		for (int p=0; p<26;p++) {
			
			counter[p] = 0;
		}

		for (int j = 0; j < N; j++) {
			for (int i = 0; i < 26; i++) {
				if (str[j].contains("" + temp[i])) {
					//System.out.println("here"+TE);
					counter[i]++;
				}
			}
		}
		int value = 0;
		for (int k = 0; k < 26; k++) {
			if (counter[k] == N) {
				value++;
			}
		}
		System.out.println(value);

	}
}
