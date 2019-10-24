package page2;

public class IntersectionofTwoLinkedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(8);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);

		ListNode l6 = new ListNode(5);
		ListNode l7 = new ListNode(0);
		ListNode l8 = new ListNode(1);
		ListNode l9 = new ListNode(8);
		ListNode l10 = new ListNode(4);
		ListNode l11 = new ListNode(5);

		l1.next = l2;
		l1.next.next = l3;
		l1.next.next.next = l4;
		l1.next.next.next.next = l5;

		l6.next = l7;
		l6.next.next = l8;
		l6.next.next.next = l9;
		l6.next.next.next.next = l10;
		l6.next.next.next.next.next = l11;

		System.out.println(getIntersectionNode(l10, l6).val);

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode tmpA = headA;
		

		while (tmpA != null) {
			ListNode tmpB = headB;
			while (tmpB != null) {
				if (tmpA == tmpB) {
					
					return tmpA;
				}
				tmpB = tmpB.next;
			}
			tmpA = tmpA.next;
		}

		return null;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
