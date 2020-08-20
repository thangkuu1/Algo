package stack;

/**
 * Stack is abstract data type which demonstrates Last in first out (LIFO) behavior. 
 * Although java provider implimentation for all abstract data types such as Stack, Queue and LinkedList but it is always good idea 
 * to understand basic data structures and implement them yourself.
 * 
 * Stack basic operations
 * Push: Push element to the top of the Stack. this operation will increase size if stack by 1.
 * pop:  remove element from the top of the Stack and returns the deleted Object. this operation will decrease size of stack by 1.
 * 
 * isEmpty: check if stack is empty or not.
 * isFull: check if stack is full or not.
 * peek: returns top element from the stack without removing it.
 * 
 * @author thangnd
 *
 */

public class StackCustom {
	
	int size;
	int arr[];
	int top;
	
	public StackCustom(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public void push(int pushedElement) {
		if(!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Push element: " + pushedElement);
		}else {
			System.out.println("stack is empty");
			
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("pop element: " + arr[returnedTop]);
			return arr[returnedTop];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		}else {
			System.out.println("Stack is empty");
			return - 1;
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return(size -1 == top);
	}
	
	public void getStack() {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		StackCustom stackCus = new StackCustom(10);
		stackCus.pop();
		System.out.println("==============");
		stackCus.push(10);
		stackCus.push(20);
		stackCus.push(30);
		stackCus.push(40);
		
		System.out.println("==============");
		stackCus.pop();
		stackCus.push(12);
		
		System.out.println("peek value: " + stackCus.peek());
		
		
		
	}

}
