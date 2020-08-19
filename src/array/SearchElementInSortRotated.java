package array;

/**
 * given an sorted and rotated array 
 * If you note that array is sorted and rotated , You need to search an element in array in n(logn) time complexity
 * @author dinhd
 *
 */

public class SearchElementInSortRotated {
	
	/*
	 * 1.compute mid (low+high)/2
	 * 2. Check if a[mid..high] is sorted
	 * 	2.1. if number lies between the range, low = mid + 1;
	 * 	2.2. if number does not liein the range, high = mid -1;
	 * 3. check if a[low...mid] is sorted
	 * 	3.1 if number lies between the range, high = mid - 1.
	 * 	3.2. if number does not lie between the range, low = mid + 1
	 */
	
	public static int findElementRotatedSortArray(int[] arr, int low, int high, int number){
		int mid;
		while(low < high){
			mid = low + ((high - low) / 2);
			if(arr[mid] == number){
				return mid;
			}
			if(arr[mid] < number){
				//right part is sorted
				if(number > arr[mid] && number < arr[high]){
					low = mid + 1;
				}else{
					high = high - 1;
				}
			}
			if(arr[mid] > number){
				//left part is sorted
				if(number > arr[low] && number < arr[mid]){
					high = mid - 1;
				}else{
					low = mid + 1;
				}
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]={16,19,21,25,30,3,5,8,10,12};
		System.out.println("element is value 8 is : " + findElementRotatedSortArray(arr, 0, arr.length -1 , 8));
	}

}
