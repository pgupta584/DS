package linkedList;

public class DoublyLinkedList
{
    private ListNode head;
    private ListNode tail;
    public static class ListNode{
        private ListNode next;
        private ListNode previous;
        int data;
        public ListNode (int data)
        {
            this.data = data;
        }
    }
    //Display LL
    public void displayLinkedList(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
    }
    // Main
    // Example null - 1 --> 5 --> 7 --> 10 -->null
    public static void main(String[] args) {
        // Create obj of DoublyLinkedList to access head & tail
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.head = new ListNode(1);
        ListNode secondNode = new ListNode(5);
        ListNode thirdNode = new ListNode(7);
        ListNode forthNode = new ListNode(10);
        //Linking Nodes
        dll.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        // print
        dll.displayLinkedList();
    }
}
