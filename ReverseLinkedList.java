package com.link.list;

public class ReverseLinkedList {

	public static void main(String[] args) {

	}

	public ListNode reverseList(ListNode head) {
		
		 ListNode current=head;
			ListNode prev=null;
			ListNode nextElem=null;
			if(current==null)
			{
				return null;
			}
			while(current!=null)
			{
				nextElem=current.next;
				current.next=prev;
				prev=current;
				if(nextElem==null)
				{
				    break;
				}
				current=nextElem;
			}
			
			
			return current;

	}

}
