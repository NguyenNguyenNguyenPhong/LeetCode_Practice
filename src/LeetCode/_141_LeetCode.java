package LeetCode;

public class _141_LeetCode {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
     }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        int Max_Step = 2;
        ListNode slow = head; // slow nhảy 1 bước
        ListNode fast = head.next; // fast nhảy 2 bước

        while (slow != null){
            int count = 0;
            while (fast != null){
                if(slow == fast) return true;
                fast = fast.next;
                count++;
                if(count == Max_Step){
                    break;
                }
            }
            slow = slow.next;

        }

        return false;
    }

}
