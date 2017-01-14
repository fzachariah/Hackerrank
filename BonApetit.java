import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int value=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            {
            if(i!=k)
                {
                sum=sum+a[i];
            }
        }
        sum=sum/2;
        if(sum!=value)
            {
            System.out.print(Math.abs(sum-value));
        }else
            {
            System.out.print("Bon Appetit");
        }
    }
}