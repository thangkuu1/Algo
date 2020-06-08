package searching;

import java.util.Random;

public class Search_Element_BST {
	
	public static int N = 5;
	public static void main(String[] args) {
		Random random = new Random();
		BST bst = new BST();
		for (int i = 0; i < N; i++) {
			int value = Math.abs(random.nextInt(100));
			System.out.print("value: " + value + ", ");
			bst.insert(value);
			
		}
//		bst.insert(10);
//		bst.insert(52);
//		bst.insert(35);
//		bst.insert(1);
//		bst.insert(17);
//		bst.insert(23);
//		bst.insert(96);
//		bst.insert(82);
//		bst.insert(24);
//		bst.insert(35);
//		bst.insert(74);
//		bst.insert(86);
		System.out.println("In Preorder traversal of the tree: ");
		bst.preorder();
		System.out.println("In order traversal of the tree: ");
		bst.inorder();
		
		bst.insert(10);
		System.out.println("value bst: ");
		bst.inorder();
	}
	
}
