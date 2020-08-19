package array;
/**
 * You are given an array of numbers. You need to find smallest and largest numbers in the array
 * @author dinhd
 *
 */
public class FindLargestSmallestNumber {

	/*
	 * Initialise two variable largest and smallest with arr[0]
	 * Iterate over array
	 * 		If current element is greater than largest, then assign current element to largest
	 * 		If current element is greater than smallest, then assign current element to smallest
	 * 
	 * get smallest and largest element in the end
	 */
	
	public static void main(String[] args) {
		int arr[] = new int[]{12,56,76,89,100,343,21,234};
		
		int smallest = arr[0];
		int largest = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest){
				largest = arr[i];
			}else if(arr[i] < smallest){
				smallest = arr[i];
			}
		}
		System.out.println("Smallest: " + smallest);
		System.out.println("Largest: " + largest);
	}
}
