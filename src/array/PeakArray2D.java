package array;


/*
 * An element is a peak element if it is greater than or equal to its four neighbors, left, right, top and bottom. 
 */

public class PeakArray2D {
	
	public int maxPeak(int a[][], int n){
		
		int max_temp = 0;
		
		//set a[n-1][0] is peak 
		if(a[n-1][0] > a[n-2][0] && a[n-1][0] > a[n-2][1] && a[n-1][0] > a[n-1][1] &&  a[n-1][0] > max_temp){
			max_temp = a[n-1][0];
		}
		//set a[0][0] is max 
		if(a[0][0] > a[1][0] && a[0][0] > a[0][1] && a[0][0] > a[1][1] && a[0][0] > max_temp){
			max_temp = a[0][0];
		}
		//set case a[0][n-1]
		if(a[0][n-1] > a[0][n-2] && a[0][n-1] > a[1][n-2] && a[0][n-1] > a[1][n-1] && a[0][n-1] > max_temp){
			max_temp = a[0][n-1]; 	
		}
		//set case a[n-1][n-1] 
		if(a[n-1][n-1] > a[n-2][n-1] && a[n-1][n-1] > a[n-2][n-2] && a[n-1][n-1] > a[n-1][n-2] && a[n-1][n-1] > max_temp ){
			max_temp = a[n-1][n-1];
		} 
		
		for(int i = 1; i < n; i++){
			for(int j = 1; j < n; j++){
				//if(a[i][j] > a[i-1][j-1] && a[i][j] > a[i-1][j] && a[i][j] > a[i][j-1])
				
			}
		}
		
		return 0;
	}

}
