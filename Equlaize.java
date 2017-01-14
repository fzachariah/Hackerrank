import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            {
            ar[i]=in.nextInt();
        }
        int [] check=new int [101];
        for(int j=0;j<n;j++)
            {
            check[ar[j]]=check[ar[j]]+1;
        }
        int max=check[0];
        for(int k=1;k<101;k++)
            {
                if(check[k]>max)
                    {
                    max=check[k];
                }
        }
        System.out.println(n-max);
    }
}