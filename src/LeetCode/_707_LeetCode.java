package LeetCode;

public class _707_LeetCode {

        static class ListNode{
            int val;
            ListNode next;
            ListNode(int val){
                this.val = val;
            }
            ListNode(int val, ListNode next){
                this.val = val;
                this.next = next;
            }
        }

        static class MyLinkedList {
            // Note head is the first node of head
            private ListNode head;
        //MyLinkedList() Initializes the MyLinkedList
        // object.
        public MyLinkedList() {
            head = null;
        }
        //int get(int index) Get the value of the indexth node in the linked list.
        // If the index is invalid, return -1.
        public int get(int index) {
            if(index < 0 ) return -1;
            else{
                ListNode tempNote = head;
                int count = 0;
                while(count != index){

                    tempNote = tempNote.next;
                    count++;
                }
                return tempNote != null ? tempNote.val : -1;
            }

        }


        //void addAtHead(int val) Add a node of value val before the first element
        // of the linked list. After the insertion, the new node
        // will be the first node of the linked list.
        public void addAtHead(int val) {
            ListNode newNode = new ListNode(val);
            if(head == null) head = newNode;
            else{
                newNode.next = head;
                head = newNode;
                return;

            }
        }
        //void addAtTail(int val) Append a node of value val as
        // the last element of the linked list.
        public void addAtTail(int val) {
            ListNode newNode = new ListNode(val);
            if(head == null) head = newNode;
            else {
                ListNode tempNote = head;
                while(tempNote.next != null){
                    tempNote = tempNote.next;
                    return;
                }
                tempNote.next = newNode;

            }
        }
        //void addAtIndex(int index, int val) Add a node of value val before the indexth
        // node in the linked list. If index equals the length of the linked list, the node
        // will be appended to the end of the linked list. If index is greater than the length,
        // the node will not be inserted
        public void addAtIndex(int index, int val) {
            if(index == 0) addAtHead(val);
            else {
                ListNode newNode = new ListNode(val);
                ListNode tempNote = head;
                int count = 0;
                while (tempNote != null) {
                    if(count == index-1){
                        newNode.next = tempNote.next;
                        tempNote.next = newNode;
                        return;
                    }
                    count ++;
                    tempNote = tempNote.next;
                }
                if(count == index){
                    addAtTail(val);
                }
            }
        }
        //void deleteAtIndex(int index) Delete the indexth node in the linked list,
        // if the index is valid.
        public void deleteAtIndex(int index) {
            ListNode tempNode = head;
            ListNode prevNode = null;
            int count = 0;

            while (tempNode != null){
                if(count == index){
                    if(index == 0){
                        head = head.next;
                    }
                    else{
                        prevNode.next = tempNode.next;
                        return;
                    }
                }
                count ++;
                prevNode = tempNode;
                tempNode = tempNode.next;
            }
        }

        public void printList(){
            ListNode tempNode = head;
            while(tempNode!= null){
                System.out.print(tempNode.val + " ");
                tempNode= tempNode.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            MyLinkedList obj = new MyLinkedList();
             obj.addAtHead(1); obj.printList();
             obj.addAtTail(3);obj.printList();
             obj.addAtIndex(1,2);obj.printList();
             obj.get(1);obj.printList();
             obj.deleteAtIndex(1);obj.printList();
             obj.get(1);obj.printList();
    }
}
