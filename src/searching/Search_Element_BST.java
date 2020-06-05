package searching;

import java.util.Random;

public class Search_Element_BST {
	
	public static int N = 20;
	public static void main(String[] args) {
		Random random = new Random();
		BST bst = new BST();
		for (int i = 0; i < N; i++) {
			bst.insert(Math.abs(random.nextInt(100)));
			
		}
		System.out.println("In order traversal of the tree: ");
		bst.inorder();
	}
	
}
