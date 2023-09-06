package dsa.stack;

// Implement Stack Using Linked List
// Stack means 1-->2-->5-->7
// 7 will be top - Follow LIFO - Last In First Out
// Stack has three method -
// push - to add element into stack
// pop - to delete top element from stack
// peek - to get top element , so we need to implement these using LL
public class Stack {
    private ListNode top;// Just taking top
    private int length;
    public Stack(){
        this.top = null;
        this.length = 0;
    }
    // Implementing LL
    public class ListNode{
        private ListNode next;// Just writing top instead of node
        private int data;
        public ListNode(int data){
            this.data= data;
        }
    }

    // Implementing Push method
    public void push(int data){
        // Creating LL Node as top
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;// now top will be assigned with data which is expected
        length++; // Since one element added in stack so length will be increased by 1
        // to understand add 2-3 item , here every time top will be replaced with temp(i.e. new node)
    }
    // Implementing pop method
    public void pop(){
        int result = top.data;// Taking top data
        top = top.next;// now top will be assigned with top.next(i.e. null)
        length--; // as
        // return result; // if you want to return pop element
    }
    // Implementing peek method
    public int peek(){
        int result = top.data;// returning top data
        return result;
    }

    // Main Method
    public static void main(String[] args) {
        // Creating Stack & Calling their function to Test
        Stack s = new Stack();
        s.push(2);
        s.push(5);
        s.push(7);
        System.out.println(s.peek());//7
        s.pop();// Last/Top element will be deleted
        System.out.println(s.peek());// 5 , Since 7 is deleted and now 5 is on top
        // Extra Test Cases
        s.pop();// 5 deleted
        s.pop();// 2 deleted, now stack top is null
        System.out.println(s.peek());// Null pointer exception So need to handle it

    }
}
