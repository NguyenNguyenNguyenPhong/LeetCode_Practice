package LeetCode;

public class _24_LeetCode {

    /**
     * A ListNode is a node in a linked list
     */
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){ this.val = val;}
        ListNode(int val, ListNode next){this.val = val;this.next = next;}
    }

    /**
     * We swap the first two nodes, then recursively call the function on the rest of the list
     *
     * @param head the head of the linked list
     * @return The head of the new list.
     */
    public static ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode noteNext = head.next;
        head.next = noteNext.next;
        noteNext.next = head;

        ListNode newHead = swapPairs(head.next);
        head.next = newHead;

        return noteNext;
    }

    /**
     * Prints the linked list.
     *
     * @param head the head of the linked list
     */
    public static void printLinkedList(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6; n6.next = n7;
        printLinkedList(n1);
        ListNode newList = swapPairs(n1);
        printLinkedList(newList);

    }
}
