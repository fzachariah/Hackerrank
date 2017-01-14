import java.math.BigInteger;
import java.util.Scanner;

public class SolutionSeven {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long t1 = Long.parseLong(scan.next());
		long t2 = Long.parseLong(scan.next());
		long n = Long.parseLong(scan.next());
		BigInteger value1 = BigInteger.valueOf(t1);
		BigInteger value2 = BigInteger.valueOf(t2);
		
		if (n == 1) {
			System.out.println(t1);
		} else if (n == 2) {
			System.out.println(t2);
		}
		else if(n>3)
		{
			BigInteger sum = BigInteger.valueOf(0);
			for(int i=3;i<=n;i++)
			{
				sum=BigInteger.valueOf(0);
				sum=value1.add(value2.multiply(value2));
				value1=value2;
				value2=sum;
				
			}
			System.out.println(sum);
		}

		scan.close();

	}

}
