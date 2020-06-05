package generate;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * This is a java program to generate and print all the subsets as per lexicographical order,
 * here we follow the numerical sequence. First genarate all the subsets having only one element,
 * then generate all the subsets having to elements and so on.
 * @author thangnd3
 *
 */

public class Lexicographic_Permutation {

	/**
	 * convert to number to binary int
	 * @param N
	 * @return
	 */
	public int[] lexicographicOrder(int N){
		int[] binary = new int[(int) Math.pow(2, N)];
		for (int i = 0; i < Math.pow(2, N); i++) {
			int b = 1;
			binary[i] = 0;
			int num = i;
			while(num > 0){
				binary[i] += (num % 2) * b;
				num /= 2;
				b = b * 10;
			}
			
		}
		return binary;
		
	}
	/*
	 * sắp xếp lại mảng bằng swap
	 */
	public int[] sortArr(int N, int[] sequence){
		for (int i = 1; i < N; i++) {
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
	
	public static void main(String[] args) {
		Lexicographic_Permutation lcp = new Lexicographic_Permutation();
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the set: ");
		int N = sc.nextInt();
		int[] sequence = new int[N];
		for (int i = 0; i < N; i++) {
			sequence[i] = Math.abs(random.nextInt(100));			
		}
		
		System.out.println("The elements in the set: ");
		for (int i = 0; i < N; i++) {
			System.out.print(sequence[i] + " ");
			
		}
		lcp.sortArr(N, sequence);
		System.out.println("\nValue array sequence: " + Arrays.toString(sequence));
		int[] mask = new int[(int) Math.pow(2, N)];
		mask = lcp.lexicographicOrder(N);
		System.out.println("\nvalue array lexicographic: " + Arrays.toString(mask));
		
		System.out.println("\n The permutations are: ");
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
