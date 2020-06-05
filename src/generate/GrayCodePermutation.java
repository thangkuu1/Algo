package generate;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * this is a java program to generate and print all the subsets using the Gray Code Order.
 * Ther reflected binary code, also known as Gray code after Frank Gray, is a binary numeral system where
 * two successive value differ in only one bit (binary digit). The gray code equivalent of a binary number is 
 * (number >> 1)^number, 
 * @author thangnd3
 *
 */
public class GrayCodePermutation {
	
	public int[] grayCode(int N){
		
		int[] grayCode = new int[(int)Math.pow(2, N)];
		int[] binary = new int[(int)Math.pow(2, N)];
		for(int i = 0; i < Math.pow(2, N); i++){
			grayCode[i] = (i >> 1) ^ i;
			System.out.println("value i: " + i);
			
		}
		System.out.println("value graycode: " + Arrays.toString(grayCode));
		for(int i = 0; i < Math.pow(2, N); i++){
			int b = 1;
			binary[i] = 0;
			while(grayCode[i] > 0){
				binary[i] += (grayCode[i] % 2) * b;
				grayCode[i] /= 2;
				b = b * 10;
			}
		}
		
		return binary;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		GrayCodePermutation gcp = new GrayCodePermutation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the set: ");
		int N = sc.nextInt();
		int[] sequence = new int[N];
		for(int i = 0; i < N; i++){
			sequence[i] = Math.abs(random.nextInt(100));
		}
		System.out.println("The elements in the set: ");
		for(int i = 0; i < N; i++){
			System.out.print(sequence[i] + " ");
		}
		
		int[] mask = new int[(int) Math.pow(2, N)];
		mask = gcp.grayCode(N);
		System.out.println("\n The pernutations are: ");
		for (int i = 0; i < Math.pow(2, N); i++) {
			System.out.print("{ ");
			for (int j = 0; j < N; j++) {
				if(mask[i] % 10 == 1){
					System.out.print(sequence[j] + " ");
					
				}
				mask[i] /= 10;
				
			}
			System.out.println("}");
		}
		sc.close();
	}

}
