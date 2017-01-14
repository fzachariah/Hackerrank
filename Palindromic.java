import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int i=0;
        int j=line.length()-1;
        boolean check=false;
        while(i<=j)
        {
        	String temp1=""+line.charAt(i);
        	String temp2=""+line.charAt(j);
        	if(!temp1.equals(temp2))
        	{
        		check=true;
        		System.out.println("NO");
        		break;
        	}
        	i++;
        	j--;
        	
        }
        if(!check)
        {
        	System.out.println("YES");
        }
        
    }
}
Language: Java