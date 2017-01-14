import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int ar[] =new int[101];
        int count=0;
        for(int i=0;i<n;i++)
            {
                if(ar[c[i]]==0)
                    {
                    ar[c[i]]=1;
                }
                else if(ar[c[i]]==1)
                    {
                    ar[c[i]]=0;
                    count++;
                }
        }
        System.out.print(count);
    }
}
