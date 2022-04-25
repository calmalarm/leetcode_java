package add_two_numbers_2;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        ListNode t = this;
        String s = "[";
        while (t != null) {
            s += (t.val+",");
            t = t.next;
        }
        s += "]";
        return s;
    }
}
