import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        for(int i=0;i<t;i++)
            {
            int n=in.nextInt();
            int count=0;
            int temp=n;
            while(n>=1)
                {
                int value=n%10;
                if(value!=0&&temp%value==0)
                    {
                    count++;
                }
                n=n/10;
            }
            System.out.println(count);
        }
    }
}