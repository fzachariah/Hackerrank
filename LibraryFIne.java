import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int dateA=in.nextInt();
        int monthA=in.nextInt();
        int yearA=in.nextInt();
        
        int dateE=in.nextInt();
        int monthE=in.nextInt();
        int yearE=in.nextInt();
        
        if(yearA!=yearE&&yearA>yearE)
            {
            System.out.println(""+10000);
        }
        else if(yearA==yearE)
            {
                if(monthA>monthE)
                    {
                    int value=monthA-monthE;
                    System.out.println(value*500);
                }
            else if(monthA<monthE)
                {
                System.out.println(""+0);
            }
            else if(monthA==monthE)
                {
                if(dateA<=dateE)
                    {
                   System.out.println(""+0);
                }
                else
                    {
                    System.out.println((dateA-dateE)*15);
                }
            }
        }
        else if(yearA!=yearE&&yearA<yearE)
            {
            System.out.println(""+0);
        }
        
    }
}