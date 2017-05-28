
public class UglyNumber {
	
	public static void main(String args[])
	{
		System.out.println(isUgly(-2147483648));
	}
	public static boolean isUgly(int num) {
		
		for (int i=2; i<6 && num>0; i++)
		{
		    while (num % i == 0)
		    {
		        num /= i;
		    }
		}
		System.out.println(num);
		return num == 1;
        
    
        
    }
}
