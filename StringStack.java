package com.hacker.rank;

import java.util.Scanner;
import java.util.Stack;

public class StringStack {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String temp=scanner.next();
		
		Stack<Character> characters=new Stack<>();
		int top=-1;
		
		for(int i=0;i<temp.length();i++)
		{
			if(top==-1)
			{
				top++;
				characters.add(temp.charAt(i));
				//System.out.println("check"+temp.charAt(i));
				
			}
			else
			{
				char comp=characters.get(top);
				if(comp==temp.charAt(i))
				{
					characters.remove(top);
					top--;
				}
				else
				{
					top++;
					characters.add(temp.charAt(i));
					//System.out.println("check"+characters.toString());
				}
			}
		}
		//System.out.println("check"+characters.toString());
		if(top==-1)
		{
			System.out.println("Empty String");
		}
		else
		{
			String value="";
			for(int i=0;i<characters.size();i++)
			{
				value=value+characters.get(i);
			}
			
			System.out.println(value);
		
		}
		
		scanner.close();

	}

}
