import java.util.HashMap;
import java.util.HashSet;

public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> hashSet=new HashSet<>();
        boolean check=false;
        for(int i=0;i<nums.length;i++)
        {
        	if(!hashSet.contains(nums[i]))
        	{
        		hashSet.add(nums[i]);
        	}
        	else
        	{
        		check=true;
        		break;
        	}
        }
        return check;
        
    }

}
