import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int p=0;p<n;p++)
            {
            boolean check =false;
            int swapPos=0;
                        int pos=0;
            String input=in.next();
            for(int i=input.length()-1;i>=0;i--)
                {
                
                if(i==0)
                    {
                    continue;
                }
                char atI=input.charAt(i);
                char atNext=input.charAt(i-1);
                if(atNext<atI)
                    {
                        check=true;
                         swapPos=i-1;
                         pos=i;
                        for(int j=i;j<input.length();j++)
                            {
                            if(input.charAt(j)>atNext)
                                {
                                pos=j;
                            }
                        }
                    break;
                }
            }
            //String originalString = "abcde";

        char[] c = input.toCharArray();

        // Replace with a "swap" function, if desired:
        char temp = c[swapPos];
        c[swapPos] = c[pos];
        c[pos] = temp;

        String swappedString = new String(c);
        if(check)
        {
                    StringBuffer st=new StringBuffer(swappedString.substring(swapPos+1));
           st=st.reverse();
            swappedString=swappedString.substring(0,swapPos+1)+""+st.toString();
                    System.out.println(swappedString);
        }
        else
         {
                System.out.println("no answer");
         }

            
            
            
            
        }
    }
}