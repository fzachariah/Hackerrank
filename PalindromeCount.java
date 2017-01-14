import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
	static int count;
 
	public static void main(String[] args) throws IOException {
 
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		temp = br.readLine();
 
		function(temp);
 
	}
 
	private static void function(String temp) throws IOException {
		count = temp.length();
		for (int c = 0; c < temp.length(); c++) {
			for (int i = 2; i <= temp.length() - c; i++) {
				String sub = temp.substring(c, c + i);
 
				reverseFunction(sub);
			}
		}
		System.out.println(count);
	}
 
	private static void reverseFunction(String sub) {
		StringBuffer initial = new StringBuffer(sub);
		initial.reverse();
 
		if (initial.toString().equals(sub)) {
 
			count++;
		}
	}
 
}
Language: Java