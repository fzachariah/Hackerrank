import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //BigInteger b=new BigInteger(""+n);
        BigInteger fact=new BigInteger(""+n);
        for(int i=n-1;i>=1;i--)
            {
            BigInteger number=new BigInteger(""+i);
            fact=fact.multiply(number);
            
            
        }
        System.out.print(fact.toString());
        
    }
}