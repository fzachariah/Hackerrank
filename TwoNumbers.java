package com.link.list;


//https://leetcode.com/problems/add-two-numbers/#/description

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class TwoNumbers {

	public static void main(String[] args) {

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode head=null;
	    ListNode temp=null;
	    
	    if(l1==null)
	    {
	    	return l2;
	    }
	    if(l2==null)
	    {
	    	return l2;
	    }
	    int rem=0;
	    while(l1!=null && l2!=null)
	    {
	    	int sum=l1.val+l2.val+rem;
	    	rem=sum/10;
	    	sum=sum%10;
	    	if(head==null)
	    	{
	    		head=new ListNode(sum);
	    		temp=head;
	    	}
	    	else
	    	{
	    		ListNode node=new ListNode(sum);
	    		temp.next=node;
	    		temp=temp.next;
	    	}
	    	l1=l1.next;
	    	l2=l2.next;
	    }
	    
	    while(l1!=null)
	    {
	    	int sum=l1.val+rem;
	    	rem=sum/10;
	    	sum=sum%10;
	    	ListNode node=new ListNode(sum);
    		temp.next=node;
    		temp=temp.next;
    		l1=l1.next;
	    }
	    
	    while(l2 != null)
	    {
	    	int sum=l2.val+rem;
	    	rem=sum/10;
	    	sum=sum%10;
	    	ListNode node=new ListNode(sum);
    		temp.next=node;
    		temp=temp.next;
    		l2=l2.next;
	    }
	    if(rem!=0)
	    {
	        ListNode node=new ListNode(rem);
    		temp.next=node;
    		temp=temp.next;
    		rem=0;
	    }
	    return head;

	}

}
