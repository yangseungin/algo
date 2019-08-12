package page1;

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode result = addTwoNumbers(l1, l2);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode resultNode = null;
		ListNode nextNode = null;
		int carry = 0;
		while (l1 != null && l2 != null) {
			int digitSum = l1.val + l2.val + carry;
			l1 = l1.next;
			l2 = l2.next;
			carry=cal(digitSum);
			digitSum %= 10;

			if (resultNode == null) {
				resultNode = new ListNode(digitSum);
				nextNode = resultNode;
			} else {
				nextNode.next = new ListNode(digitSum);
				nextNode = nextNode.next;
			}

			if (l1 == null && l2 == null && carry == 1) {
				nextNode.next = new ListNode(carry);
				nextNode = nextNode.next;
			}
		}
		while (l1 != null) {
			int digitSum = l1.val + carry;
			carry=cal(digitSum);
			digitSum %= 10;
			nextNode.next = new ListNode(digitSum);
			nextNode = nextNode.next;
			l1 = l1.next;
			
			if (l1 == null && carry == 1) {
				nextNode.next = new ListNode(carry);
				nextNode = nextNode.next;
			}
		}
		while (l2 != null) {
			int digitSum = l2.val + carry;
			carry=cal(digitSum);
			digitSum %= 10;
			nextNode.next = new ListNode(digitSum);
			nextNode = nextNode.next;
			l2 = l2.next;
			
			if (l2 == null && carry == 1) {
				nextNode.next = new ListNode(carry);
				nextNode = nextNode.next;
			}
		}

		return resultNode;
	}
	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		 ListNode dummyHead = new ListNode(0);
		ListNode resultNode = dummyHead;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int digitSum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
			carry = cal(digitSum);
			digitSum %= 10;

			resultNode.next = new ListNode(digitSum);
			resultNode = resultNode.next;
			
			if(l1!=null)
				l1=l1.next;
			if(l2!=null)
				l2=l2.next;

		}
		
		if(carry>0){
			resultNode.next=new ListNode(carry);
		}
		
		
		return dummyHead.next;
	}
	public static int cal(int digitSum){
		int num=0;
		if (digitSum >= 10) {
			num = 1;
			digitSum %= 10;
		} else {
			num = 0;
		}
		
		return num;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
