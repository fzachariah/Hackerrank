import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int k=in.nextInt();
        int count=0;
        for(int p=i;p<=j;p++)
            {
            StringBuffer number=new StringBuffer(""+p);
            number=number.reverse();
            int reverse=Integer.parseInt(number.toString());
            //System.out.println(reverse);
            int value=Math.abs(p-reverse);
            if(value%k==0)
                {
                count++;
            }
            
           
        }
        System.out.print(count);
    }
}