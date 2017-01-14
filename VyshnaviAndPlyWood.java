import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		temp = br.readLine();
		int N = Integer.parseInt(temp);
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			function(line);
		}
 
	}
 
	private static void function(String line) throws IOException {
		int ar[] = new int[2];
		int p = 0;
		for (String retval : line.split(" ")) {
			ar[p] = Integer.parseInt(retval);
			p++;
		}
		int M = ar[0];
		int K = ar[1];
		boolean flag = true;
		int start = 1;
		int tmp = 1;
		int count = 0;
		while (flag) {
			if (K == 0 && start == M) {
				break;
			}
			if (start == M) {
				K--;
			}
			start = start + tmp;
			count++;
			if (start == 5) {
				tmp = -1;
 
			} else if (start == 1) {
				tmp = 1;
			}
		}
		System.out.println(count);
	}
 
}
Language: Java