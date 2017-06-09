import java.util.ArrayList;
import java.util.List;

public class DuplicatesArray {
	
	public static void main(String args[])
	{
		int nums[]={4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(nums).toString());

	}
	
	public static  List<Integer> findDuplicates(int[] nums) {
      List<Integer> integers=new ArrayList<>();
      
      for(int i=0;i<nums.length;i++)
      {
    	  int value=Math.abs(nums[i]);
    	  if(nums[value-1]<0)
    	  {
    		  integers.add(value);
    	  }
    	  else
    	  {
    		  nums[value-1]=(nums[value-1])*-1;
    	  }
      }
      
      return integers;
    }	

}
