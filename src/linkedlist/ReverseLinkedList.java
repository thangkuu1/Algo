package linkedlist;

/**
 * reverse a linked list
 * 
 * @author thangnd
 *
 */

public class ReverseLinkedList {

	/*
	 * Iterative
	 * 		1. have three nodes previousNode, currentNode and nextNode
	 * 		2. when currentNode is starting node, then previousNode will be null
	 * 		3. Assign currentNode.next to previousNode to reverse the link.
	 * 		4. in each iteration move currentNode and priviousNode by 1 node.
	 */
	
	public Node reverseLinkedList(Node currentNode) {
		Node previousNode = null;
		Node nextNode;
		
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList singlyList = new SinglyLinkedList();
		
		Node node = new Node(5);
		
		
		singlyList.addTheLast(node);
		singlyList.addTheLast(new Node(2));
		singlyList.addTheLast(new Node(7));
		singlyList.addTheLast(new Node(1));
		singlyList.addTheLast(new Node(3));
		singlyList.printLinkedList(node);
		ReverseLinkedList reverse = new ReverseLinkedList();
		Node reverseHead = reverse.reverseLinkedList(node);
		singlyList.printLinkedList(reverseHead);
		
	}
}
