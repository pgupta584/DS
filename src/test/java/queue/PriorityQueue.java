package queue;

public class PriorityQueue {
    ListNode front;
    ListNode rear;
    int length;
    // Write method for returning length
    public int length(){
        return length;
    }
    // Write method to check if queue is empty
    public boolean isEmpty(){
        return length == 0;//If length is zero means queue is empty
    }
    class ListNode{
        int data ;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Creating Method to add queue
    public void enqueue(int data){
        ListNode newElement = new ListNode(data);
        if(isEmpty()){
            front = newElement;// Means if queue is empty 1st element will be on front
        }else {
            rear.next = newElement;//Means next queue element will be on rear.next place
        }
        rear = newElement;
        length++;//Length will be increased whenever there will be next element added
    }
    public void printQueue(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while (current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("null");
    }
    public int peek(){
        return front.data;
    }
    // Main Method for Testing
    public static void main(String[] args) {
        // Creating Object
        PriorityQueue p = new PriorityQueue();
        p.enqueue(2);
        p.enqueue(4);
        p.enqueue(6);
        p.enqueue(8);
        //System.out.println("Implemented queue "+p);// This will just give address of object so we need to call print method
        p.printQueue();
        System.out.println(p.peek());// Just return peek data
    }
}
