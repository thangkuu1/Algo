package searching;

public class SortArr {
	public int[] sortArr(int[] sequence){
		for (int i = 1; i < sequence.length; i++) {
			int j = i;
			int temp = sequence[i];
			while(j > 0 && temp < sequence[j - 1]){
				sequence[j] = sequence[j - 1];
				j = j - 1;
			}
			sequence[j] = temp;
		}
		return sequence;
	}

}
