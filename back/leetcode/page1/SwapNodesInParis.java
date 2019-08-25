package page1;

public class SwapNodesInParis {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);

		ListNode result = swapPairs(l1);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode swapPairs(ListNode head) {
		ListNode dummyHead = new ListNode(0);
		ListNode resultNode = dummyHead;

		if (head == null || head.next == null) {
			return head;
		}
		ListNode n1 = head;
		ListNode n2 = head.next;

		while (n1 != null && n2 != null) {
			resultNode.next = n2;
			ListNode tmp = n2.next;
			n2.next = n1;
			resultNode = n1;

			n1.next = tmp;
			n1 = n1.next;

			if (tmp != null) {
				n2 = tmp.next;
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
