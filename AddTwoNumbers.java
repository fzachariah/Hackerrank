
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumbers {

	ListNode listNode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int i = 0;
		int rem = 0;
		int sum = 0;
		ListNode listNodeHead = null;
		ListNode listNodeTraverse = null;
		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val + rem;
			if (sum > 9) {
				rem = sum / 10;
			}
			else
			{
				rem=0;
			}
			sum = sum % 10;
			if (i == 0) {

				ListNode listNode = new ListNode(sum);
				listNodeHead = listNode;
				listNodeTraverse = listNode;

			} else {
				ListNode listNode = new ListNode(sum);
				listNodeTraverse.next = listNode;
				listNodeTraverse = listNode;
			}
			i++;
			l1 = l1.next;
			l2 = l2.next;
		}

		if (l1 != null && l2 == null) {

			while (l1 != null) {
				sum = rem + l1.val;
				if (sum > 9) {
					rem = sum / 10;
				}
				else
				{
					rem=0;
				}
				sum = sum % 10;
				ListNode listNode = new ListNode(sum);
				listNodeTraverse.next = listNode;
				listNodeTraverse = listNode;
				l1=l1.next;
			}

		}

		if (l2 != null && l1 == null)

		{

			while (l2 != null) {
				sum = rem + l2.val;
				if (sum > 9) {
					rem = sum / 10;
				}
				else
				{
					rem=0;
				}
				sum = sum % 10;
				ListNode listNode = new ListNode(sum);
				listNodeTraverse.next = listNode;
				listNodeTraverse = listNode;
				l2=l2.next;
			}

		}

		if (rem != 0) {
			ListNode listNode = new ListNode(rem);
			listNodeTraverse.next = listNode;
			listNodeTraverse = listNode;
		}

		return listNodeHead;

	}

}
