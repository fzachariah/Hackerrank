import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		String temp = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L=Integer.parseInt(br.readLine());
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			temp = br.readLine();
			function(temp,L);
		}
 
	}
 
	private static void function(String temp, int l) throws IOException {
 
		int ar[]=new int[2];
		int p=0;
		for (String retval : temp.split(" ")) {
			ar[p]=Integer.parseInt(retval);
			p++;
			
		}
		if(ar[0]<l||ar[1]<l)
		{
			System.out.println("UPLOAD ANOTHER");
			
		}else if(ar[0]>=l&&ar[1]>=l)
		{
			if(ar[0]==ar[1])
			{
				System.out.println("ACCEPTED");
			}
			else
			{
				System.out.println("CROP IT");
			}
		}
	}
 
}
Language: Java