import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         int n = Integer.parseInt(in.nextLine());
         long x[][]=new long[2*n][2*n];
    for(int i=0;i<2*n;i++){
        String values=in.nextLine();
        int j=0;
        for (String string : values.split(" ")) {
				
			
            x[i][j]=Long.parseLong(string);
            j++;
        }
        /*for(int j=0;j<2*n;j++){
            x[i][j]=in.nextLong();
        }*/
    }
          long sum=0;
          int value=2*n;
    for(int i=0;i<n;i++)
        {
        
        for(int j=0;j<n;j++)
            {
            sum=sum+maximum(x[i][j],x[i][value-1-j],x[value-1-i][j],x[value-i-1][value-1-j]);
            
        }
    }
          System.out.println(sum);
         
         testCases--;
      }
    }
    public static long maximum(long a,long b,long c,long d)
        {
        long largest = Math.max(a,Math.max(b,Math.max(c,d)));
        return largest;
    }
}