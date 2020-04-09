package day30challenge;

public class MiddleoftheLinkedList {

	public static ListNode middleNode(ListNode head) {
		ListNode first = head, second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
