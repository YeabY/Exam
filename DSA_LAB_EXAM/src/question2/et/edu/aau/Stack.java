package question2.et.edu.aau;

class Stack{
	private int capacity;
	private int top;
	private int arrStack[];
	
	Stack(int maxSize){
		capacity = maxSize;
		arrStack = new int[maxSize];
		top = -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public void push(int x) {
		if (!isFull()) {
			arrStack[++top] = x;
		}
		else{
			System.out.println("Stack is Full! You cant add the element "+x);
			System.exit(1);
		}
	}
	
	
	public int pop() {
		if(!isEmpty()) {
			return arrStack[top--];
		}
		throw new IllegalStateException ("Empty Stack! Nothing to be popped!");

			
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arrStack[top];
		}
		return -1;
	}
	
	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public static void main(String[] args) {
		Stack ob = new Stack(5);
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		ob.push(5);

		
		ob.pop();
		ob.push(3);
		
		
		ob.pop();


		
		for(int i = 0; i < ob.size(); i++) {
			System.out.println(ob.arrStack[i]);
		}
		System.out.println("Size is "+ ob.size());
		
	}
}