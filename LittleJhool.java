import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
 
		function(line);
	}
 
	private static void function(String temp) {
		int count;
		int i;
		if (temp.length() < 6) {
			System.out.println("Good luck!");
		} 
		else {
			
			for (i = 0; i < temp.length(); i++) {
				count = 1;
 
				if (i + 6 > temp.length()) {
					System.out.println("Good luck!");
					break;
				} else {
					
					for (int j = i + 1; j < i + 6; j++) {
						
						
						String comp = "" + temp.charAt(i);
						String comp1 = "" + temp.charAt(j);
						if (comp.equals(comp1)) {
							count++;
						}
						
					}
					if(count==6)
					{
						System.out.println("Sorry, sorry!");
						break;
					}
				}
			}
 
		}
	}
}
Language: Java