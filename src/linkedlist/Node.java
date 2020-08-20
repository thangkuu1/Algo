package linkedlist;

public class Node {
	
	public int data;
	public Node next;
	
	
	Node(int data) {
		this.data = data;
	}
	
	public Node() {
	}


	public void displayNodeData() {
		System.out.print(" { " + data + " } ");
		
	}

}
