import java.util.ArrayList;
import java.util.List;

public class DisappearNumber {

	public static void main(String[] args) {
		int[] nums={4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums).toString());
	}
	
public static List<Integer> findDisappearedNumbers(int[] nums) {
	
	List<Integer> integers=new ArrayList<>();
	
	
	for(int i=0;i<nums.length;i++)
	{
		int val = Math.abs(nums[i]) - 1;
        if(nums[val] > 0) {
            nums[val] = -nums[val];
        }
		
	}
	
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]>0)
		{
			integers.add(i+1);
		}
	}
	
	return integers;
    }

}
