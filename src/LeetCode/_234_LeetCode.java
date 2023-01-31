package LeetCode;

public class _234_LeetCode {
    public class  ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }

    public int countNodeList(ListNode head){
        int count = 0;
        while (head != null){
            count ++;
            head = head.next;
        }
        return count;
    }

    public ListNode reverseList(ListNode head){
        ListNode currentNode = head;

        while(currentNode != null && currentNode.next != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        int n = countNodeList(head);
        int k = (n%2 == 0) ? n/2 : (n/2 +1);
        if(k == 0) return  true;
        int index = 0;
        ListNode currentNode = head;
        while (currentNode != null){
            if(index == k) {break;}
            index++;
            currentNode = currentNode.next;
        }
        ListNode newList = reverseList(currentNode);
         index = 0;
        while (index < k){
            if(head.val != newList.val)
                return false;
            head = head.next;
            newList = newList.next;
            index++;
        }
        return true;
    }
}
