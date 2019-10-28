package page3;

public class RemoveLinkedListElements {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(6);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(5);
		ListNode l7 = new ListNode(6);
		l1.next = l2;
		l1.next.next = l3;
		l1.next.next.next = l4;
		l1.next.next.next.next = l5;
		l1.next.next.next.next.next = l6;
		l1.next.next.next.next.next.next = l7;

		System.out.println(removeElements(l1, 6).val);
	}

	public static ListNode removeElements(ListNode head, int val) {
		ListNode result = new ListNode(-1);
		result.next = head;
		ListNode tmp = result;
		while (tmp.next != null) {
			if (tmp.next.val == val) {
				ListNode next = tmp.next;
				tmp.next = next.next;
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
