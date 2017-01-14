import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TestClass {
	public static void main(String[] args) throws IOException {
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		for(int i=0;i<T;i++)
		{
		 String temp = br.readLine();
		function(temp);
		}
 
	}
 
	private static void function(String temp) {
		try
		{
		int n=Integer.parseInt(temp);
		if(n==1)
		{
			System.out.println("Yes");
		}
		else
		{
		if(((n)&(n-1))==0)
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
		}
 
		}
		catch(Exception e)
		{
			System.out.println("No");
		}
	}
 
 
}
Language: Java