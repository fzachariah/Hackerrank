
public class StockPrice {

	public static void main(String args[])
	{
		int ar[]={2,4,1};
		System.out.println(maxProfit(ar));
	}

	public static int maxProfit(int[] prices) {
		
		
		int minElement=Integer.MAX_VALUE;
		int maxElement=Integer.MIN_VALUE;
		
		int result=-1;
		
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]<minElement)
			{
				minElement=prices[i];
				maxElement=Integer.MIN_VALUE;
			}
			else if(prices[i]>minElement&&prices[i]>maxElement)
			{
				maxElement=prices[i];
			}
			
			if(minElement!=Integer.MAX_VALUE &&maxElement!=Integer.MIN_VALUE)
			{
				int temp=maxElement-minElement;
				if(temp>result)
				{
					result=temp;
				}
			}
		}
		if(result==-1 )
		{
			maxElement=0;
			minElement=0;
			result=0;
		}
		return result;

	}

}
