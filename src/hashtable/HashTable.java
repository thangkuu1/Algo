package hashtable;

import java.util.Scanner;

public class HashTable {
	
	int arr[];
	int capacity;
	public HashTable(int capacity) {
		
		this.capacity = nextPrime(capacity);
		arr = new int[this.capacity];
	}
	
	public void insert(int ele){
		arr[ele % capacity] = ele;
	}
	
	public void clear(){
		arr = new int [capacity];
	}
	
	public boolean contains(int ele){
		return arr[ele % capacity] == ele;
	}
	
	public void delete(int ele){
		if(arr[ele % capacity] == ele){
			arr[ele % capacity] = 0;
		}else{
			System.out.println("Error: Element not found");
		}
	}
	
	public int nextPrime(int n){
		if(n % 2 == 0){
			n++;
		}
		for(; !isPrime(n); n +=2);
		
		return n;
	}
	
	public static boolean isPrime(int n){
		if(n == 2 || n == 3){
			return true;
		}
		if(n == 1 || n % 2 == 0){
			return false;
		}
		for(int i = 3; i < n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public void printTable(){
		System.out.println("Hash Table: ");
		for(int i = 0; i < capacity; i++){
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hash Table");
		System.out.println("Enter size HashTable: ");
		HashTable ht = new HashTable(scan.nextInt());
		char ch;
		do{
			System.out.println("Hash Table Choice Operations: ");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Contains");
			System.out.println("4. Clear");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter integer element to insert");
					ht.insert(scan.nextInt());
					break;
				case 2:
					System.out.println("Enter integer element to delete");
					ht.delete(scan.nextInt());
					break;
				case 3: 
					System.out.println("Enter integer element to check if present");
					System.out.println("Contains: " + ht.contains(scan.nextInt()));
					break;
				case 4:
					ht.clear();
					System.out.println("Hash Table Cleared!!");
					
			}
			ht.printTable();
			System.out.println("Do you want to continue (Choice Y or N): ");
			ch = scan.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}

}
