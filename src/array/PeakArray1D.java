package array;

import java.util.ArrayList;
import java.util.List;

/*Given an array of integers. Find a peak element in it. An array element is peak if it is NOT  smaller than its neighbors.
For input array {10, 20, 15, 2, 23, 90, 67} there are two peak element: 20 and 90.

*/
public class PeakArray1D {
	
	public List<Integer> findPeakUtils(int arr[], int low, int high, int n){
		List<Integer> list_peak = new ArrayList<Integer>();
		int mid = low + (high - low)/2;
		
		if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] < arr[mid])){
			list_peak.add(mid);
			return list_peak;
		}else if(mid > 0 && arr[mid - 1] > arr[mid]){
			 return findPeakUtils(arr, low, (mid -1), n);
		}else{
			 return findPeakUtils(arr, (mid + 1), high, n);
		}
		//System.out.println("1");
		//return list_peak;
	}
	public List<Integer> findPeak(int arr[], int n){
		List<Integer> list =  findPeakUtils(arr, 0, n-1, n);
		return list;
	}
	public static void main(String[] args) {
		int[] arr ={1, 3, 20, 4, 1, 11, 12};
		PeakArray1D peak = new PeakArray1D();
		//int mid = peak.findPeakUtils(arr, 0, arr.length - 1, arr.length);
		List<Integer> list_mid = peak.findPeak(arr, arr.length);
		System.out.println("List peak index: " + list_mid.size());
		for(int i =0; i < list_mid.size(); i++){
			System.out.println("mid value: " + list_mid.get(i));
		}
	}

}
