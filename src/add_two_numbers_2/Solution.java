package add_two_numbers_2;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode t = l;
        int tmp = 0;
        while (l1 != null || l2 != null) {
            if (l2 == null) {
                tmp = l1.val + t.val;
                if (tmp < 10) {
                    t.val = tmp;
                    t.next = l1.next;
                    break;
                }
                l1 = l1.next;
            }
            else if (l1 == null) {
                tmp = l2.val + t.val;
                if (tmp < 10) {
                    t.val = tmp;
                    t.next = l2.next;
                    break;
                }
                l2 = l2.next;
            }
            else {
                tmp = l1.val + l2.val + t.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            t.val = tmp%10;
            if (tmp/10>0 || l1 != null || l2 != null) {
                t.next = new ListNode(tmp / 10);
                t = t.next;
            }
        }
        return l;
    }
}
