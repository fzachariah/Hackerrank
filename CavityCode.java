import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        String tempString[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
            tempString[grid_i]=grid[grid_i];
        }
        for(int i=1;i<n-1;i++)
            {
                for(int j=1;j<n-1;j++)
                    {
                        char pivot=grid[i].charAt(j);
                        char nextBottom=grid[i+1].charAt(j);
                        char nextTop=grid[i-1].charAt(j);
                        char nextleft=grid[i].charAt(j-1);
                        char nextRight=grid[i].charAt(j+1);
                        if(pivot>nextBottom &&pivot>nextTop&&pivot>nextleft&&pivot>nextRight)
                        {
                        	String temp=grid[i].substring(0,j)+"X"+grid[i].substring(j+1);
                        	grid[i]=temp;
                        }
                }
        }
        for(int grid_i=0; grid_i < n; grid_i++){
            System.out.println(grid[grid_i]);
        }
    }

}
