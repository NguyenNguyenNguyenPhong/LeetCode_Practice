package LeetCode;

public class _142_LeetCode {

     class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
     }

     /**
      * Trả về -1 nếu không phải Cycle
      * Trả về 0 nếu là Cycle nhưng không phải là từ node xuất phát
      * Trả về 1 nếu là Cycle nếu bắt đầu từ node xuất phát
      * @param currNode the current node that we are checking
      */
     public int checkNode(ListNode currNode){
        if(currNode == null) return -1;

        ListNode slow = currNode;
        ListNode fast = currNode.next;
        while (slow != null && fast!= null && fast.next != null  ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                if(slow == currNode) return 1;
                else return 0;
            }
//            slow = slow.next;
//            fast = fast.next.next;
        }
        return -1;
     }

    public ListNode detectCycle(ListNode head) {
        ListNode currNode = head;
        while (currNode!= null){
            int result = checkNode(currNode);
            if(result == -1) return null;
            else if(result == 1) return currNode;
            else  currNode = currNode.next;
        }
        return null;
    }
}
