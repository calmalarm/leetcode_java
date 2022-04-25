package add_two_numbers_2;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2,4,3,9,9};
        int[] arr2 = {5,6,4,1};
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode t = l1;
        for (int i=0; i<arr1.length; i++) {
            t.val = arr1[i];
            if (i < arr1.length-1) {
                t.next = new ListNode();
                t = t.next;
            }
        }
        t = l2;
        for (int i=0; i<arr2.length; i++) {
            t.val = arr2[i];
            if (i < arr2.length-1) {
                t.next = new ListNode();
                t = t.next;
            }
        }
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(Solution.addTwoNumbers(l1, l2).toString());
    }
}
