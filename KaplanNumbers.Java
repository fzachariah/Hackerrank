import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
Integer min = in.nextInt();
Integer max = in.nextInt();
StringBuilder result = new StringBuilder();

Integer[] kaprekar = new Integer[]{1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999};

for (int i = 0; i < kaprekar.length; i++) {
     if(kaprekar[i] >= min && kaprekar[i] <= max){
         result.append(kaprekar[i] + " ");
     }
}

System.out.println(result.length() == 0 ? "INVALID RANGE": result);
	}
}