package recursive;



/**
 * Algorithm for computing the k-th power of 2
 * Input: k,a natural number
 * Output: k-th power of 2
 * @author thangnd3
 *
 */
public class Power_of_2 {

	public long Power(int k){
		
		if(k == 0){
			return 1;
		}else{
			return 2*Power(k - 1);
		}
		
		
	}
	public static void main(String[] args) {
		Power_of_2 p = new Power_of_2();
		
		int k =500;
		long result = p.Power(k);
		System.out.println(result);
	}
}
