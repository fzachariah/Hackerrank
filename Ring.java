import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class TestClass {
 
	public static void main(String[] args) throws NumberFormatException,
			IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++)
		{
			String temp=br.readLine();
			functionAlgo(temp);
		}
 
	}
 
	private static void functionAlgo(String temp) {
		int values[]=new int[2];
		int k=0;
		for (String element : temp.split(" ")) {
			values[k]=Integer.parseInt(element);
			k++;			
		}
		if(values[0]==0)
		{
			if(values[1]%2==0)
			{
				System.out.println(0);
			}
			else
				System.out.println(1);
		}
		else if(values[0]==1)
		{
			if(values[1]%2==0)
			{
				System.out.println(1);
			}
			else
				System.out.println(0);
		}
		else if(values[0]==2)
		{
			if(values[1]==0)
			{
				System.out.println(2);
			}else
			{
				if((values[1]-1)%2==0)
				{
					System.out.println(1);
				}
				else
					System.out.println(0);
			}
		}
		
	}
 
}
Language: Java