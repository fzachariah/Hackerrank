package com.link.list;

public class DeleteNth {

	public static void main(String[] args) {
		

	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 
		 ListNode mainPointerhead=head;
		 ListNode referencePointer=head;
		 
		 int count=1;
		 while(count<n)
		 {
			 referencePointer=referencePointer.next;
			 count++;
		 }
		 
		 while(referencePointer!=null)
		 {
			 referencePointer=referencePointer.next;
			 mainPointerhead=mainPointerhead.next;
		 }
		 
		 mainPointerhead.val=mainPointerhead.next.val;
		 mainPointerhead.next=mainPointerhead.next.next;
		 
		 
		 return head;
		 
	        
	    }

}
