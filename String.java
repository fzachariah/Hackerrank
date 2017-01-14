import java.util.Scanner;
 
class TestClass {
	public static void main(String args[]) throws Exception {
		int[] dashes = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		Scanner scanner = new Scanner(System.in);
		int sumDashes = 0, i = 0, digit;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			sumDashes = 0;
			for (i = 0; i < line.length(); i++) {
				digit = Character.getNumericValue(line.charAt(i));
				sumDashes += dashes[digit];
			}
		}
		System.out.println(sumDashes);
	}
}
Language: Java