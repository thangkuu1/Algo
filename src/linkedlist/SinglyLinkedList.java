package linkedlist;

public class SinglyLinkedList {

	private Node head;
	public boolean isEmpty() {
		return(head == null);
	}
	//insert a node at the start of linked list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	//delete node from start of the linked list
	public Node deleteFirst() {
		Node tempNode = head;
		head = head.next;
		return tempNode;
	}
	
	public void deleteAfter(Node after) {
		Node temp = head;
		while(temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if(temp.next != null) {
			temp.next = temp.next.next;
		}
	}
	
	public void insertLast(int data) {
		Node current = head;
		while(current.next != null) {
			current = current.next;// loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		
	}
	
	public void addTheLast(Node node) {
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void printLinkedList() {
		System.out.println("print linked list head-> last: ");
		Node current = head;
		while(current != null) {
			current.displayNodeData();
			current = current.next;
		}
	}
	public void printLinkedList(Node node) {
		Node temp = node;
		while(temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList singlyList = new SinglyLinkedList();
		singlyList.insertFirst(5);
		singlyList.insertFirst(6);
		singlyList.insertFirst(7);
		singlyList.insertFirst(1);
		singlyList.insertLast(3);
		singlyList.insertFirst(2);
		
		 singlyList.printLinkedList();
		Node node = new Node();
		node.data = 1;
		singlyList.deleteAfter(node);
		singlyList.printLinkedList();
	}
}
