package LeetCode;

public class _160_LeetCode {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
  }
    public boolean checkCommon(ListNode currenrNodeA, ListNode headB){
          while (headB != null){
              if(headB == currenrNodeA) return true;
              headB = headB.next;
          }
          return false;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//          while (headA != null){
//              if(checkCommon(headA, headB) == true) return headA;
//              headA = headA.next;
//          }
//          return null;

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB){
            if(pA != null){
                pA = pA.next;
            }else pA = headB;

            if(pB != null){
                pB =pB.next;
            }else pB = headA;

        }
        return pA;
    }
}
