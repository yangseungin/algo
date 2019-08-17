package page1;

import page1.AddTwoNumbers.ListNode;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode result = mergeTwoLists(l1, l2);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode sumNode = dummyHead;

		while (l1 != null || l2 != null) {
			if (l1 == null) {
				sumNode.next = new ListNode(l2.val);
				sumNode = sumNode.next;
				if (l2.next != null)
					l2 = l2.next;
				else {
					l2 = null;
				}
				continue;

			} else if (l2 == null) {
				sumNode.next = new ListNode(l1.val);
				sumNode = sumNode.next;
				if (l1.next != null)
					l1 = l1.next;
				else {
					l1 = null;
				}
				continue;
			}

			if (l1.val <= l2.val) {
				sumNode.next = new ListNode(l1.val);
				sumNode = sumNode.next;
				if (l1.next != null)
					l1 = l1.next;
				else {
					l1 = null;
				}
			} else {
				sumNode.next = new ListNode(l2.val);
				sumNode = sumNode.next;

				if (l2.next != null)
					l2 = l2.next;
				else {
					l2 = null;
				}
			}

		}

		return dummyHead.next;

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
