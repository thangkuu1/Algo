package searching;

public class BSTNode {
	
	BSTNode left, right;
	int data;
	
	
	/*constructor*/
	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}
	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}
	
	//function to set left node
	public void setLeft(BSTNode n){
		left = n;
	}
	
	//function to set right node
	public void setRight(BSTNode n){
		right = n;
	}
	
	//function to get right node 
	public BSTNode getRight(){
		return right;
	}
	
	//function to get left node
	public BSTNode getLeft(){
		return left;
	}
	
	
	public void setData(int d){
		data = d;
	}

	public int getData(){
		return data;
	}
}
