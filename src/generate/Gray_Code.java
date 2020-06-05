package generate;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Gray_Code {
	
	

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number og elements in the set: ");
		int N = sc.nextInt();
		int[] grayArr = new int[(int) Math.pow(2, N)];
		for (int i = 0; i < Math.pow(2, N); i++) {
			grayArr[i] = (i >> 1) ^ i;
			
		}
		System.out.println("Gray array code: "  + Arrays.toString(grayArr));
		int[] binaryGrayArr = new int[grayArr.length];
		for(int i = 0; i < grayArr.length; i++){
			binaryGrayArr[i] = Integer.valueOf(Integer.toBinaryString(grayArr[i]));
		}
		System.out.println("Binary array code: " + Arrays.toString(binaryGrayArr));
	}
}
