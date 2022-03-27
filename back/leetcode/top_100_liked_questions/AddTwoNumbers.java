package top_100_liked_questions;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode x = addTwoNumbers(listNode, listNode2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode node = new ListNode(0);
        ListNode result = node;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum >= 10) {
                node.next = new ListNode(sum - 10);
                carry = 1;
            } else {
                node.next = new ListNode(sum);
                carry = 0;
            }
            node = node.next;
        }

        if (carry == 1) {
            node.next = new ListNode(1);
        }

        return result.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
