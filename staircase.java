import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=n;i>=1;i--)
            {
            int j=i-1;
            for(int k=1;k<=n;k++)
                {
                if(k<=j)
                    {
                    System.out.print(" ");
                }
                else
                    {
                    System.out.print("#");
                }
                
                
            }
             
            System.out.print("\n");
        }
    }
}
