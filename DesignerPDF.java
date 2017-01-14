import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int width=word.length();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<word.length();i++)
            {
                int value=h[word.charAt(i)-97];
            if(value>max)
                {
                max=value;
            }
        }
        System.out.print(width*max);
    }
}
