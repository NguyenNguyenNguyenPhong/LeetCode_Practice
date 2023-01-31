package LeetCode;

public class _203_LeetCode {



      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode removeElements(ListNode head, int val) {
            ListNode currentNode = head;
            ListNode prevNode = null;

            while (currentNode != null){
                boolean isRemove = false;
                // remove current Node
                if(currentNode.val == val){
                    isRemove = true;
                    if(prevNode == null){
                        head = currentNode.next;
                    }else
                        prevNode.next = currentNode.next;
                }
                prevNode = (isRemove == true) ? prevNode : currentNode;
                currentNode = currentNode.next;
            }
          return head;
    }
}
