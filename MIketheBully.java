import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		 int t=Integer.parseInt(br.readLine());
	        while(t--!=0)
	        {
	            int n=Integer.parseInt(br.readLine());
	            for(int num=2;num<=n;num++)
	                if(isPrime(num))
	                    for(int i=2;i<=num;i++)
	                        if(isPrime(i) && isPrime(num-i))
	                        {
	                            System.out.print(num+" ");
	                            break;
	                        }
	            System.out.println();
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