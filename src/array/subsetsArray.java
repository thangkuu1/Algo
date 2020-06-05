package array;

/**
 * Finding all the sub arrays of an array. Inefficient approach, needs another optimized solution!
 * @author thangnd3
 *
 */

public class subsetsArray {

	public void subsetsOfArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int k = 0; k< arr.length; k++){
				for(int j = k; j < arr.length - i; j++){
					System.out.print(arr[j] + " ");
				}
				System.out.printf("%n");
			}
		}
	}
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4};
//		subsetsArray subset = new subsetsArray();
//		subset.subsetsOfArray(arr);
		 String s = "rttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttyrtyryrtyrttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttyrtyryrtyrtttttttttttttttttttttttttttttttttt123123123123123123123123tttyrtttttttttttttttttt123123123123123123123";
	        System.out.println("s value: " + s.length());
		
	}
}
