package LeetCode;

public class _19_LeetCode {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        ListNode prevNode = null;
        int count = 1;

        while (currentNode != null){
            if(count == n+1){
                prevNode = head;
            }

            if(currentNode.next == null){
                if(prevNode == null){
                    if(count == n){
                        return head.next;
                    }
                    return head;
                }
                else {
                    if(prevNode.next != null){
                        prevNode.next = prevNode.next.next;
                    }
                    return head;
                }
            }
            count++;
            currentNode = currentNode.next;
            prevNode = (prevNode == null) ? null : prevNode.next;
        };

        return head;
    }
}
