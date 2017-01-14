import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
 
		String passwords[] = new String[N];
		for (int i = 0; i < N; i++) {
			passwords[i] = new String();
			passwords[i] = br.readLine();
 
		}
		function(passwords);
	}
 
	private static void function(String[] passwords) throws IOException {
		boolean flag = false;
		StringBuffer string = null;
		for (int i = 0; i < passwords.length; i++) {
			if (!flag) {
				string = new StringBuffer(passwords[i]);
				for (int j = 0; j < passwords.length; j++) {
					if (j != i) {
 
						StringBuffer reverseoNE = new StringBuffer(passwords[j]);
						
						reverseoNE=reverseoNE.reverse();
 
						if (reverseoNE.toString().equals(string.toString())) {
 
							flag = true;
							break;
						}
					}
					else
					{
 
					}
				}
			} else {
				break;
			}
 
		}
		int n = (string.length() / 2);
		System.out.println(string.length() + " " + string.charAt(n));
 
	}
 
}
Language: Java