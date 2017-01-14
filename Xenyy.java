import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] values = line.split(" ");
        
        if(values[1].trim().length()>values[0].trim().length())
        {
        	System.out.println(""+values[1]+" "+values[0]);
        }
        else if(values[0].length()>values[1].length())
        {
        	System.out.println(""+values[0]+" "+values[1]);
        }
        else if(values[1].trim().length()==values[0].trim().length())
        {
        	String temp1=values[0];
        	String temp2 =values[1];
        	for (int i=0;i<values[0].length();i++)
        	{
        		if(Integer.parseInt(""+temp2.charAt(i))>Integer.parseInt(""+temp1.charAt(i)))
        		{
        			System.out.println(""+values[1]+" "+values[0]);
        			break;
        		}
        		else
        		{
        			continue;
        		}
        		
        	}
        }
        
       
        
        
    }
}
