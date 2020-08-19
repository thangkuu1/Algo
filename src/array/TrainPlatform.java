package array;

import java.util.Arrays;

/**
 * problem: you are given arrival and departure time of trains reaching to a particular station. you need to find minimum
 * of platform required to accommodate the trains at any point of time 
 * @author dinhd
 *
 */
public class TrainPlatform {
	
	/*
	 * Using merge sort 
	 * 1. Sort both arrival(arr) and departure(dep) arrays/
	 * 2. compare current element in arrival and departure array and pick smaller one among both.
	 * 3. if element is pick up from arrival array then increment platform_need
	 * 4. If element is pick up from departure array then decrement platform_need
	 * 5. while performing above steps, we need track count of maximum value reached for platform_need
	 * 6. in the end, we will return maximum value reached for platform_need 
	 */
	public static int findPlatformRquiredStation(int arr[], int dep[], int n){
		int platformNeed = 0;
		int maxPlatform = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 0, j = 0;
		while(i < n && j < n){
			if(arr[i] < dep[j]){
				platformNeed++;
				i++;
				if(platformNeed > maxPlatform){
					maxPlatform = platformNeed;
				}
			}else{
				platformNeed--;
				j++;
			}
		}
		return maxPlatform;
	}
	
	public static void main(String[] args) {
		int arr[] = {100, 140, 150, 200, 215, 400};
		int dep[] = {110, 300, 220, 230, 315, 600};
		System.out.println("Platform station need: " + findPlatformRquiredStation(arr, dep, 6));
	}

}
