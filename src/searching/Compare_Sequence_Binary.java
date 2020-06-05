package searching;
/**
 * This is a java program to compare Binary Search and Linear Search algorithms.
 * Following class provides the time required to search an element for both the algorithm
 * @author thangnd3
 *
 */
public class Compare_Sequence_Binary {
	
	public static int N = 1000;
	public static int[] sequence = new int[N];
	
	public boolean sequentialSearch(int[] sequence, int key){
		for (int i = 0; i < sequence.length; i++) {
			if(sequence[i] == key){
				return true;
			}
		}
		return false;
	}
	 
	public boolean binarySearch(int[] sequence, int key){
		
		int low = 0;
		int high = sequence.length;
		
		while(low <= high){
			int mid = (low + high) /2;
			if(key < sequence[mid]){
				high = mid - 1;
			}else if(key > sequence[mid]){
				low = mid + 1;
			}else{
				return true;
			}
		}
		
		return false;
	}
	
	public int partitionIt(int left, int right, long pivot){
		int leftPtr = left - 1;
		int rightPtr = right;
		while(true){
			while(sequence[++leftPtr] < pivot);
			while(rightPtr > 0 && sequence[--rightPtr] > pivot);
			if(leftPtr >= rightPtr){
				break;
			}else{
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, rightPtr);
		return leftPtr;
	}
	
	public void swap(int dex1, int dex2){
		int temp = sequence[dex1];
		sequence[dex1] = sequence[dex2];
		sequence[dex2] = temp;
		
	}

}
