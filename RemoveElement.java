
public class RemoveElement {

	public static void main(String[] args) {

	}

	public static int removeElement(int[] nums, int val) {
		int j=0;
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				int temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				j++;
				count++;
			}
		}
		return count;
	}

}
