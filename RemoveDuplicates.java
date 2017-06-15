package com.link.list;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String args[]) {

	}

	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode list = head;
        if(list==null)
        {
        	return null;
        }
        while(list != null) {
       	
       	 if (list.val == list.next.val) {
       		 list.next = list.next.next;
       	 } else {
       		 list = list.next;
       	 }
        }
        
        return head;

	}

}
