import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        
        String result="";
        
       if(year<1918)
           {
            
            if(year%4==0)
                {
                    result="12.09."+year;
            }
           else
               {
               result="13.09."+year;
           }
       }
        else if(year>1918)
            {
            
            if(year%400==0 ||(year%4==0 && !(year%100==0)))
               {
                    result="12.09."+year;
               }
               else
               {
                   result="13.09."+year;
               }
        }
        else
            {
               result="26.09."+year; 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
