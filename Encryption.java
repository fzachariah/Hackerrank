import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String input=in.next();
        int length=input.length();
        int min=(int)Math.floor(Math.sqrt(length));
        int max=(int)Math.ceil(Math.sqrt(length));
        for(int i=0;i<max;i++)
            {
                int j=i;
                do
                    {
                        System.out.print(""+input.charAt(j));
                    j=j+max;
                    
                }while(j<length);
            System.out.print(" ");
        }
    }
}