import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		String temp = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			int L=Integer.parseInt(br.readLine());
			temp = br.readLine();
			function(temp,L);
		}
 
	}
 
	private static void function(String temp, int l) throws IOException {
 
		int ar[]=new int[l];
		int p=0;
		for (String retval : temp.split(" ")) {
			ar[p]=Integer.parseInt(retval);
			p++;
			
		}
		int sum=0;
		for(int i=0;i<l;i++)
		{
			sum=sum+ar[i];
		}
		sum=sum-(l-1);
		System.out.println(sum);
	}
 
}
Language: Java