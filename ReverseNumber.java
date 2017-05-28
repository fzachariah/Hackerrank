public class Solution {
    public int reverse(int x) {
        long temp=x;
        boolean check=false;
        if(x<0)
        {
            check=true;
            temp=temp*-1;
        }
        long result=0;
        if(temp>9)
        {
        while(temp>0)
        {
            long test=temp%10;
            result=(result*10)+test;
            temp=temp/10;
           
        }
        }else
        {
            result=temp;
        }
        
        if(check)
        {
            result=result*-1;
        }
        
        if(result > Integer.MAX_VALUE) return 0;
        else if(result<Integer.MIN_VALUE) return 0;
        else
        return (int)result;
    }
}