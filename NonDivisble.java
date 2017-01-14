import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int ar[]=new int[n];
        int value[]=new int[k];
       
        for(int i=0;i<n;i++)
            {
               ar[i]=in.nextInt(); 
        }
        for(int i=0;i<n;i++)
            {
                int result=ar[i]%k;
                
                value[result]=value[result]+1;
        }
        int finalResult=0;
        if(value[0]>=1)
            {
            
            finalResult++;
        }
        for(int i=1;i<=k/2;i++)
            {
            
          
            if(value[i]>value[k-i])
                {
                finalResult=finalResult+value[i];
              
            }
            else if(value[i]!=0&&value[i]==value[k-i])
                {
                finalResult=finalResult+1;
            }
            else
                {
                finalResult=finalResult+value[k-i];
             
            }
            //System.out.println(value[i]);
        
        
    }
        System.out.println(finalResult);
    }
    
}