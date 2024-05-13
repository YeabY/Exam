package question3.et.edu.aau;

import java.util.Stack;

public class QueueStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
 
    public void enqueue(int element) {
        stack1.push(element);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new IllegalStateException("\nQueue is empty");
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack2.peek();
    }
    
    public static void main(String[] args) {
    	QueueStack qs = new QueueStack();
    	qs.enqueue(2);
    	qs.enqueue(3);
    	qs.enqueue(4);
    	qs.dequeue();

    	//Printing out for test
    	
    	System.out.println(qs.dequeue());
    	System.out.println(qs.dequeue());


    	
    	
    	
    }
}

