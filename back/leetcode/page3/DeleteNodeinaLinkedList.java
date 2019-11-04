package page3;

public class DeleteNodeinaLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(9);

		l1.next = l2;
		l1.next.next = l3;
		l1.next.next.next = l4;

		deleteNode(l1);

	}

	//함수의 node는 삭제해야할 node의 인수이다 
	public static void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
