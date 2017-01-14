import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
            {
            int n=in.nextInt();
            int p=in.nextInt();
            int a[]=new int[n];
            for(int k=0;k<n;k++)
                {
                    a[k]=in.nextInt();
            }
            int count=0;
            for(int j=0;j<n;j++)
                {
                if(a[j]<=0)
                    {
                    count++;
                }
            }
            if(count<p)
                {
                System.out.println("YES");
            }
            else
                {
                System.out.println("NO");
            }
        }
    }
}