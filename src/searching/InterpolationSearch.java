package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Interpolation Search Algorithm. Interpolation search is an algorithm for searching for a given key value
 * in an indexed array that has been ordered by the values of the key.
 * On average the interpolation search makes about log(log(n)) comparisons( if the elements are uniformly distributed)
 * where n is the number of the elements to be search. In the worst case( for instance where the numerical value of
 * the keys increase exponentially) it can make up to O(n) comparisons.
 * In interpolation-sequential search, interpolation is used to find an item near the one being searched for,
 * then linear search is used to find the exact item.
 * @author thangnd3
 *
 */
public class InterpolationSearch {
	
	public int interpolationSearch(int[] sortArr, int toFind){
		int low = 0;
		int high = sortArr.length - 1;
		int mid;
		while(sortArr[low] <= toFind && sortArr[high] >= toFind){
			if(sortArr[high] - sortArr[low] == 0){
				return (low + high)/2;
			}
			mid = low + ((toFind - sortArr[low]) * (high - low)) / (sortArr[high] - sortArr[low]);
			if(sortArr[mid] < toFind){
				low = mid + 1;
			}else if(sortArr[mid] > toFind){
				high = mid - 1;
			}else 
				return mid;
		}
		if(sortArr[low] == toFind){
			return low;
		}else{
			return -1;
		}
	}
	public static void main(String[] args) {
		SortArr sa = new SortArr();
		InterpolationSearch is = new InterpolationSearch();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = random.nextInt(100);
			
		}
		System.out.println("arr: " + Arrays.toString(arr));
		sa.sortArr(arr);
		System.out.println("arr sort: " + Arrays.toString(arr));
		//int[] sortArr = {1,3,5,7,8,9,10};
		System.out.println("Enter value find: ");
		int find = sc.nextInt();
		int mid = is.interpolationSearch(arr, find);
		System.out.println("value mid: " + mid);
		sc.close();
	}

}
