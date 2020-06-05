package recursive;
/**
 * Recursive Algorithm for Sequential Search
 * Input: L is array, i and j are positive integer, i <=j, and x is the key to be search for in L.
 * Output: If x is in L between indexes i and j, then output its index, else return 0
 * @author thangnd3
 *
 */
public class SequentialSearch {
	
	public int SeqSearch(int[] L, int i, int j, int x){
		if(i <= j){
			if(L[i] == x){
				return i;
			}else{
				return SeqSearch(L, i + 1, j, x);
			}
		}else{
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		SequentialSearch ss = new SequentialSearch();
		int[] L = {1,2,2,5,3};
		int result = ss.SeqSearch(L, 1, 4, 5);
		System.out.println(result);
	}

}
