import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
         //Write code to solve each of the test over here
        int temp=N/C;
        int tempOne=M;
        int sum=temp;
        while(temp/M>=1)
            {
             int tempX=0;
                tempX=tempX+(int)(temp/M);
            sum=sum+tempX;
            
                temp=tempX+(temp%M);
                
           
        }
        return sum;
    }
    
    
}
