package stack;

public class Introduction {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty(){
		return (top < 0);
	}
	
	Introduction(){
		top = -1;
	}
	
	boolean push(int x){
		if(top >= (MAX -1)){
			System.out.println("Stack Overflow");
			return false;
		}else{
			a[++top] = x;
			System.out.println(x + " push into stack");
			return true;
		}
		
	}
	int pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
			return 0;
		}else{
			int x = a[top--];
			return x;
		}
	}
	
	int peek(){
		if(top < 0){
			System.out.println("Stack Underflow"); 
			return 0;
		}else{
			int x = a[top];
			return x;
		}
	}
	
//	int size(){
//		
//	}
	
	public static void main(String[] args) {
		Introduction intro = new Introduction();
		intro.push(10);
		intro.push(20);
		intro.push(30);
		
	}
}
