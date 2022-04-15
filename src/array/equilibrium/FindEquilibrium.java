package array.equilibrium;
/**
 * find the equilibrium index of an array
 * the equilibrium index of an array is an index such that the sum of
 * elements at lower indexes is equal to the sum of elements at higher
 * indexes.
 * ex: input A[] = [-7,1,5,2,-4,3,0];
 * => 3 is an equilibrium index A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */
public class FindEquilibrium {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,-4,3,0};

        for(int i = 0; i < arr.length; i++){
            int sumLeft = 0;

            for(int j = 0; j < i; j++){
                sumLeft += arr[j];
//                System.out.println("sumLeft: " + sumLeft);
            }
            int sumRight = 0;
            for(int j = i + 1; j < arr.length; j++){
                sumRight += arr[j];
//                System.out.println("sumRight: " + sumRight);
                if(sumLeft == sumRight){
                    System.out.println(i);
                }
            }

        }
    }
}
