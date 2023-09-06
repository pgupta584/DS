package dsa.linkedList;

public class SinglyLinkedList {
    private ListNode head;
    public static class ListNode{
        private int data ;
        private ListNode next;
        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void displayLinkedList()
    {
        ListNode current = head;
        // While current node is null iterate all
        while(current!=null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertFirst()
    {
        // Create a Node which you want to insert - ex- insert 1
        ListNode newNode = new ListNode(1);
        ListNode current = head;
        head = newNode;
        newNode.next = current;
    }

    public void insertLast()
    {
        // Create a Node which you want to insert - ex- insert 15
        ListNode newNode = new ListNode(15);
        ListNode current = head;
        if (head==null)
        {
            head = newNode;
        }
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertPosition()
    {
        // Create a Node which you want to insert - ex- insert 6
        ListNode newNode = new ListNode(6);
        int position = 4;
        // My current node
        ListNode current = head;
        // We have to traverse till position-1 so that we can link the node with previous node
        // And again next new node with next node
        for (int i=1;i<position-1;i++)
        {
            current = current.next;
            if(current==null)
            {
                throw new RuntimeException("Position is Greater than the list");
            }
        }
        // so Now our current will be pointing to position-1
        // so Link the current with new node & again new node with current.next
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete first
    public void deleteFirst(){
        ListNode current = head;
        // LL = 1 --> 2 --> 5 --> 6 --> 7 --> 10 --> 15 --> null
        // Now we want to delete 1st node means head.next will now not point to next but null
        // and head.next will become head
        if(head==null){// if there are no elements to delete - so just puttinga check
            throw new RuntimeException("LL is null");
        }
        // now actual action - https://www.youtube.com/watch?v=z0SOY9UlUPE&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=49
        head = head.next;
        current.next = null;
    }

    // Main Method
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        // Create object of ListNode to create nodes & Assign it to head
        ssl.head = new ListNode(2);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(7);
        ListNode forth = new ListNode(10);
        // Above Multiple nodes are created
        // Now We need to link the nodes
        ssl.head.next = second;
        second.next = third;
        third.next = forth;
        // Now we need to display/Print it
        ssl.displayLinkedList();
        // Insert Call
        ssl.insertFirst();
        System.out.println();// New Line
        System.out.println("After Insert");
        // Again Printing
        ssl.displayLinkedList();
        //Insert Last
        ssl.insertLast();
        // Again Printing
        System.out.println();// New Line
        System.out.println("After Last");
        ssl.displayLinkedList();
        // insert at position
        ssl.insertPosition();
        // Again Printing
        System.out.println();// New Line
        System.out.println("After inserting at position");
        ssl.displayLinkedList();
        // delete first
        ssl.deleteFirst();
        // Again Printing
        System.out.println();// New Line
        System.out.println("After delete 1st");
        ssl.displayLinkedList();
    }
}
