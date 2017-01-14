import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int value=5;
        for(int i=1;i<=n;i++)
            {
                sum=sum+(value/2);
                value=(value/2)*3;
        }
        System.out.print(sum);
    }
}