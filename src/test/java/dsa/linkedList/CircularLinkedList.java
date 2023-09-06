package dsa.linkedList;

public class CircularLinkedList
{
    private ListNode head;

    public static class ListNode
    {
        private int data ;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void displayLinkedList()
    {
        CircularLinkedList.ListNode current = head;
        // While current node is null iterate all
        while(current!=null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    // Main method
    // https://www.youtube.com/watch?v=0ODSrJcMT54&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=81
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.head= new ListNode(1);
        ListNode secondNode= new ListNode(5);
        ListNode thirdNode= new ListNode(7);
        ListNode forthNode= new ListNode(10);
        cll.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = cll.head;
        // printing
        cll.displayLinkedList();
    }
}
