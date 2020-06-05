package recursive;
/**
 * Given integers a,n, and m with n >= 0,and 0<=a<m compute a^n(mod m),
 * Input: integers a, n and m, with 
 * @author thangnd3
 *
 */
public class Fast_Exponentiation {
	
	public int fastExp(int a, int n, int m){
		if(n == 0){
			return 1;
		}
		if(n == 1){
			return a;
		}
		return 0;
	}

}
