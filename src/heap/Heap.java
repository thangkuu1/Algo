package heap;

import java.util.Scanner;

public class Heap {

	private int[] heapArray;
	private int maxSize;
	private int heapSize;
	//constructor
	public Heap(int mx){
		maxSize = mx;
		heapSize = 0;
		heapArray = new int[maxSize];
	}
	
	//check if heap is empty
	public boolean isEmpty(){
		return heapSize == 0;
	}
	
	//function to insert element
	public boolean insert(int ele){
		if(heapSize + 1 == maxSize){
			return false;
		}
		heapArray[++heapSize] = ele;
		int pos = heapSize;
		while(pos != 1 && ele > heapArray[pos/2]){
			heapArray[pos] = heapArray[pos/2];
			pos /= 2;
		}
		heapArray[pos] = ele;
		return true;
	}
	//function to remove element
	public int remove(){
		int parent, child;
		int item, temp;
		if(isEmpty())throw new RuntimeException("Error: Heap empty");
		item = heapArray[1];
		temp = heapArray[heapSize - 1];
		parent = 1;
		child = 2;
		while(child < heapSize){
			if(child < heapSize && heapArray[child] < heapArray[child + 1]){
				child++;
			}
			if(temp >= heapArray[child])
				break;
			heapArray[parent] = heapArray[child];
			parent = child;
			child *= 2;
		}
		heapArray[parent] = temp;
		return item;
		
		
	}
	//function to print values
	public void displayHeap(){
		System.out.print("\nHeap array: ");
		for (int i = 0; i < heapSize; i++) {
			System.out.println(heapArray[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Heap Test \n\n");
		System.out.println("Enter size of heap");
		Heap heap = new Heap(sc.nextInt());
		char ch = 0;
		do{
			System.out.println("\nHeap Operations\n");
			System.out.println("1. insert");
			System.out.println("2. delete item with max key");
			System.out.println("3. check item");
			boolean chk;
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				chk = heap.insert(sc.nextInt());
				if(chk){
					System.out.println("Insertion successful\n");
				}else{
					System.out.println("insertion failed\n");
				}
				break;
			case 2: 
				System.out.println("Enter integer element to detele");
				if(!heap.isEmpty()){
					heap.remove();
				}else
					System.out.println("Error. Heap is empty \n");
				break;
			case 3:
				System.out.println("Empty status: " + heap.isEmpty());
				break;
			default:
				break;
			}
			//display heap
			heap.displayHeap();
			System.out.println("\n Do you want to continue (y/n)\n");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
	
}
