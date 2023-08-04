package queue;

import java.util.PriorityQueue;
import java.util.Queue;
// Queue - Means FIFO - First In First Out - Like a queue
// First Added element will be removed 1st
public class BasicQueueTest_1 {
    public static void main(String[] args) {
        Queue<Integer> q= new PriorityQueue<>();
        q.add(1);
        q.add(4);
        q.add(7);
        q.add(8);
        System.out.println("Queue "+q);
        q.remove();//Removed 1st Added Element as it's Queue - FIFO - First In First Out - Like a queue
        System.out.println("Queue after removing element "+q);
        System.out.println("Front element "+q.peek());// Return peek element or Front element
        System.out.println("Front element "+q.poll());// Return peek element or Front element
    }
}
