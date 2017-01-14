import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class TestClass {
 
	public static void main(String[] args) throws IOException {
 
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		for (int i = 0; i < T; i++) {
			temp = br.readLine();
			function(temp);
			
		}
 
	}
 
	private static void function(String temp) throws IOException {
		String values="2345679";
		boolean x=true;
		for(int i=0;i<temp.length();i++)
		{
			String k=""+temp.charAt(i);
			if(values.contains(k))
			{
				x=false;
				break;
			}
		}
		if(x==false)
		System.out.println("NO");
		else
		{
			x=true;
			int start=0 , end=temp.length()-1;
			while(start<end)
			{
				String tempOne=""+temp.charAt(start);
				String tempTwo=""+temp.charAt(end);
				if(!(tempOne.equals(tempTwo)))
				{
					x=false;break;
				}
				start++;
				end--;
			}
			 if(x)System.out.println("YES");
			 else System.out.println("NO");
		}
	}
 
}
Language: Java