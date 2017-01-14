import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            ///algorithm begins
            long sum=(x*b)+(y*w);
            if(x<=z &&y<=z)
                {
                System.out.println(sum);
            }
            else if(x>z&&y<=z)
                {
                    long sumTemp=(y*w)+((y+z)*b);
                    if(sumTemp<sum)
                        {
                        System.out.println(sumTemp);
                    }
                else
                    {
                     System.out.println(sum);
                }
            }
            else if(y>z&&x<=z)
                {
                    long sumTemp=(x*b)+((x+z)*w);
                    if(sumTemp<sum)
                        {
                        System.out.println(sumTemp);
                    }
                else
                    {
                     System.out.println(sum);
                }
            }
            else if(y>z&&x>z)
                {
                    if((x+z)<y)
                        {
                        long sumTemp=(x*b)+((x+z)*w);
                        System.out.println(sumTemp);
                    }
                else if((y+z)<x)
                    {
                    long sumTemp=(y*w)+((y+z)*b);
                    System.out.println(sumTemp);
                }
                else
                    {
                    //long sum1=(x*b)+(y*w);
                    System.out.println(sum);
                }
            }
            
            
        }
    }
}
