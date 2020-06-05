package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This is a Java Program to Implement Ternary Search Algorithm.
 * A ternary search algorithm is a technique in computer scince for finding the minimum or maximum of
 * an increasing or decreasing function. A ternary search determines either that the minimum or maximum cannot
 * be in the first third of the domain or that it cannot be in the last third of the domain, then repeats on 
 * the remaining two-thirds, A ternary search is an example of a divide and conquer algorithm.
 * @author thangnd3
 *
 */
public class TernarySearch {
	
	public int ternarySearch(int[] A, int value, int start, int end){
		
		if(start > end){
			return -1;
		}
		int mid1 = start + (end - start) / 3;
		
		int mid2 = start + 2 * (end-start) / 3;
		
		if(A[mid1] == value){
			return mid1;
		}else if(A[mid2] == value){
			return mid2;
		}else if(value < A[mid1]){
			return ternarySearch(A, value, start, mid1-1);
		}else if(value > A[mid2]){
			return ternarySearch(A, value, mid2+1, end);
		}else{
			return ternarySearch(A, value, mid1, mid2);
		}
		
		
	}
	
	public int ternarySearch(int[]A, int value){
		return ternarySearch(A, value, 0, A.length - 1);
	}
	
	public static void main(String[] args) {
		TernarySearch ts = new TernarySearch();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of integer elements: ");
//		int n = sc.nextInt();
		
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = random.nextInt(100);
//			
//		}
		int[] arr = {55, 49, 5, 84, 76, 85, 1, 4, 36, 30};
		System.out.println("Array is: " + Arrays.toString(arr));
//		System.out.println("Enter value to search: ");
//		int value = sc.nextInt();
		int value = 36;
		int result = ts.ternarySearch(arr, value);
		
		if(result == -1){
			System.out.println("\n" + value + " element not found");
		}else{
			System.out.println("\n" + value + " element found at position " + result);
		}
		sc.close();
	}

}
