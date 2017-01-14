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
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int E=100;
        int i=((0+k)%n);
        if(c[i]==0)
            {
            E=E-1;
        }
        else
            {
            E=E-1-2;
        }
        while(E>=0&& i!=0)
            {
            i=((i+k)%n);
            if(c[i]==0)
            {
            E=E-1;
        }
        else
            {
            E=E-1-2;
        }
        }
        System.out.print(E);
    }
}
