import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ar[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            ar[c_i] = in.nextInt();
        }
        int i=0;
        int count=0;
        while(i<n)
            {
            if(i==n-2)
                {
                i=i+1;
                count=count+1;
            }else if(i==n-1)
                {
                i=i+1;
            }else
                {
            if(ar[i+1]==0&&ar[i+2]==0)
                {
                i=i+2;
                count=count+1;
            }
            else if(ar[i+1]==0&&ar[i+2]==1)
                {
                i=i+1;
                count=count+1;
            }
            else if(ar[i+1]==1&&ar[i+2]==0)
                {
                i=i+2;
                count=count+1;
            }
            }
        }
        System.out.print(count);
    }
}
