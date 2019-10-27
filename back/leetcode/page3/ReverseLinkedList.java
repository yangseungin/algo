package page3;

import java.util.Stack;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		
		l1.next=l2;
		l1.next.next=l3;
		l1.next.next.next=l4;
		l1.next.next.next.next=l5;
		System.out.println(reverseList(l1).val);
	}

	public static ListNode reverseList(ListNode head) {
		Stack<ListNode> stack= new Stack<ListNode>();
		while(head!=null){
			stack.push(head);
			head=head.next;
		}
		ListNode tmp = new ListNode(-1);
		head=tmp;
		while(!stack.isEmpty()){
			ListNode curr = stack.pop();
			head.next=new ListNode(curr.val);
			head=head.next;
		}
		return tmp.next;
		
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
