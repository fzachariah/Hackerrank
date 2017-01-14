import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
 
 
	public static void main(String[] args) throws IOException {
 
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		temp = br.readLine();
		int N=Integer.parseInt(temp);
		function(N);
 
	}
 
	private static void function(int n) throws IOException {
		int count=0;
		
		for(int i=2;i<1000;i++)
		{
			if(isPrime(i))
			{
				count++;
			}
			if(count==n)
			{
				System.out.println(i);
				break;
			}
		}
	
		
	}
	static boolean isPrime(int x)
    {
        if(x==2)
            return true;
        if(x%2==0 || x==1 || x==0)
            return false;
        for(int i=3;i<=Math.sqrt(x);i+=2)
            if(x%i==0)
                return false;
        return true;
    }
 
}
Language: Java