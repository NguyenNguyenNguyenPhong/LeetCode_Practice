package LeetCode;

public class _21_LeetCode {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    /**
     * If the first element of list1 is smaller than the first element of list2, then the first element of list1 is the
     * first element of the merged list. Otherwise, the first element of list2 is the first element of the merged list
     *
     * @param list1 the first list to be merged
     * @param list2 [1,2,4]
     * @return The head of the merged list.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //
        if(list1 == null) return  list2;
        if(list2 == null) return  list1;

        if(list1.val <= list2.val){
            ListNode nextLis1 = list1.next;
            ListNode nextElement = mergeTwoLists(nextLis1, list2);
            list1.next = nextElement;
            return list1;
        }
        else{
            mergeTwoLists(list2, list1);
            return list2;
        }
    }

    public static void printList(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        ListNode n4= new ListNode(7);
        ListNode n5 = new ListNode(9);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(6);
        ListNode a4 = new ListNode(8);
        ListNode a5 = new ListNode(10);
        a1.next = a2; a2.next = a3; a3.next = a4; a4.next = a5;

        printList(n1);
        printList(a1);
        ListNode newList = mergeTwoLists(n1, a1);
        printList(newList);
    }
}
