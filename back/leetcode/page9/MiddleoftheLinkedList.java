package page9;

public class MiddleoftheLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next =  new ListNode(3);
		l1.next.next.next =  new ListNode(4);
		l1.next.next.next.next =  new ListNode(5);
		System.out.println(middleNode(l1).val);
	}

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
