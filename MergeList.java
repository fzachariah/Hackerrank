package com.link.list;

public class MergeList {

	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		ListNode listNode = null;
		ListNode tempNode = null;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				if (listNode == null) {
					listNode = new ListNode(l1.val);
					tempNode = listNode;
				} else {
					ListNode listNode2 = new ListNode(l1.val);
					tempNode.next = listNode2;
					tempNode = tempNode.next;
				}
				l1 = l1.next;
			} else {
				if (listNode == null) {
					listNode = new ListNode(l2.val);
					tempNode = listNode;
				} else {
					ListNode listNode2 = new ListNode(l2.val);
					tempNode.next = listNode2;
					tempNode = tempNode.next;
				}
				l2 = l2.next;
			}
		}

		while (l1 != null) {
			ListNode listNode2 = new ListNode(l1.val);
			tempNode.next = listNode2;
			tempNode = tempNode.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			ListNode listNode2 = new ListNode(l2.val);
			tempNode.next = listNode2;
			tempNode = tempNode.next;

			l2 = l2.next;
		}

		return listNode;

	}

}
