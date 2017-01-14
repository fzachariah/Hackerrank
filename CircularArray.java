import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
           int rot=k%n;
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
         
            if(rot==0)
                {
               System.out.println(a[m]);
            }
            else{
                int position=m-rot;
                if(position<0)
                    {
                        position=n+position;
                    System.out.println(a[position]);
                }
                else
                    {
                    System.out.println(a[position]);
                }
                
            }
        }
    }
}
