package com.link.list;

public class SwapNodePairs {

	public static void main(String[] args) {

	}

	public ListNode swapPairs(ListNode head) {

		if(head==null ||head.next==null)
		{
			return head;
		}
		
		ListNode prev=null;
		ListNode newNode=head.next;
		ListNode a=head;
		ListNode b=a.next;
		
		while(a!=null && b!=null)
		{
			a.next=b.next;
			b.next=a;
			if(prev!=null)
			{
				prev.next=b;
			}
			if(a.next==null)
			{
				break;
			}
			prev=a;
			b=a.next.next;
			a=a.next;
		}
		
		
		return newNode;
		
		
	}

}
