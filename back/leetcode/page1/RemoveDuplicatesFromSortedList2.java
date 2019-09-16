package page1;

public class RemoveDuplicatesFromSortedList2 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(5);
		l1.next = l2;
		l1.next.next = l3;
		l1.next.next.next = l4;
		l1.next.next.next.next = l5;
		l1.next.next.next.next.next = l6;
		l1.next.next.next.next.next.next = l7;

		System.out.println(l1.val);
		System.out.println(l1.next.val);
		System.out.println(l1.next.next.val);
		System.out.println(l1.next.next.next.val);
		System.out.println(l1.next.next.next.next.val);
		System.out.println(l1.next.next.next.next.next.val);
		System.out.println(l1.next.next.next.next.next.next.val);
		deleteDuplicates(l1);
		System.out.println("==========");
		System.out.println(l1.val);
		System.out.println(l1.next.val);
		System.out.println(l1.next.next.val);

	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode result = new ListNode(0);
		result.next = head;

		ListNode tmp = result;
		while (tmp.next != null && tmp.next.next != null) {
			if (tmp.next.val == tmp.next.next.val) {
				int tmpValue = tmp.next.val;
				while (tmp.next != null && tmp.next.val == tmpValue) {
					tmp.next = tmp.next.next;
				}
			} else {
				tmp = tmp.next;
			}
		}
		return result.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
