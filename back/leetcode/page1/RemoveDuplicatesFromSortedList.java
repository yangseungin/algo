package page1;

public class RemoveDuplicatesFromSortedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(3);
		l1.next = l2;
		l1.next.next = l3;
		l1.next.next.next = l4;
		l1.next.next.next.next = l5;

		System.out.println(l1.val);
		System.out.println(l1.next.val);
		System.out.println(l1.next.next.val);
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
		ListNode tmp = head;

		while (tmp != null && tmp.next != null) {
			if (tmp.val == tmp.next.val) {
				tmp.next = tmp.next.next;
			} else {
				tmp = tmp.next;
			}
		}

		return head;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
