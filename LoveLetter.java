import java.util.Scanner;

class Solution {

	public static void main(String args[]) {
		int T;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
        sc.nextLine();
		
		
		
		   
		    while(T!=0)
		    {
		        String str=new String();
		        str=sc.nextLine();
                
		        int s = 0;
		        for(int i=0 ; i< str.length()/2 ; i++)
		        {
		              s += Math.abs(str.charAt(i) - str.charAt(str.length()-i-1));
		        }
		        System.out.println(s);
		        T--;
		    }
		
	}
}
