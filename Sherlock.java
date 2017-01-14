import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
            {
            int first =in.nextInt();
            int second=in.nextInt();
            int count=0;
            double firstSquare=Math.sqrt(first);
            double secondSquare=Math.sqrt(second);
            int exactFirst=(int)Math.ceil(firstSquare);
            int exactSecond=(int)Math.floor(secondSquare);
            count=exactSecond-exactFirst+1;
            
            System.out.println(count);
        }
    }
}