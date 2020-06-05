package binary_string;

public class BinaryStringGen {
	
	public void printArray(int arr[], int n){
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public void genarateBinaryString(int n, int arr[], int i){
		if(i == n){
			printArray(arr, n);
			return;
		}
		arr[i] = 0;
		genarateBinaryString(n, arr, i+1);
		
		arr[i] = 1;
		genarateBinaryString(n, arr, i+1);
	}
	
	public static void main(String[] args) {
		BinaryStringGen bsg = new BinaryStringGen();
		int n = 2;
		int arr[] = new int[n];
		bsg.genarateBinaryString(n, arr, 0);
	}
}
