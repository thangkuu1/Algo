package stack;

import org.w3c.dom.Node;

/**
 * 
 * @author thangnd
 *
 */
public class LinkedListStack {
	
	private Node head; //the first node
	
	//nest class to define linkedlist node
	private class Node{
		int value;
		Node next;
	}
	
	public LinkedListStack() {
		head = null;
	}
	
	public void push(int value) {
		Node oldNode = head;
		head = new Node();
		head.value = value;
		head.next = oldNode;
	}
	
	public int pop() {
		if(head == null) {
			throw new LinkedListEmptyException();
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	private class LinkedListEmptyException extends RuntimeException{
		private static final long serialVersionUID = 1L;
		public LinkedListEmptyException() {
			super();
		}
		
		public LinkedListEmptyException(String message ) {
			super(message);
		}
	}

}
