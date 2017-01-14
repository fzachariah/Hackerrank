import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int ar[]=new int [n];
        for(int i=0;i<n;i++)
            {
            ar[i]=in.nextInt();
        }
        int count=n;
        
        Arrays.sort(ar);
        while(count>=1)
            {
            System.out.println(count);
            int small=ar[n-count];
                for(int i=0;i<n;i++)
                    { 
                    if(ar[i]>=1)
                        {
                    ar[i]=ar[i]-small;
                        if(ar[i]==0)
                            {
                            count--;
                        }
                    }
                        
                }
        }
        
        
    }
}