import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		temp = br.readLine();
		int N = Integer.parseInt(temp);
 
		String line = br.readLine();
		function(line, N);
 
	}
 
	private static void function(String line, int n) throws IOException {
 
		long ar[] = new long[n];
		int p = 0;
		for (String retval : line.split(" ")) {
			ar[p] = Integer.parseInt(retval);
			p++;
		}
		Arrays.sort(ar);
 
		for (int i = 0; i < n; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(ar[i]+" ");
			}
 
		}
		 System.out.print("\n");
		 for( int i=n-1;i>=0;i--)
		    {
		        if(ar[i]%2==1)
		        {
		        	System.out.print(ar[i]+" ");
		        }
		    }
		
 
	}
}
Language: Java