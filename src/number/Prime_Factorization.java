package number;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Have the user enter a number and find all Prime Factors (if there are eny) and display them
 * 
 * Solution: 
 * 
 * @author thangnd3
 *
 */

public class Prime_Factorization {
	
	public ArrayList findPriceFactor(int num){
		
		ArrayList factor = new ArrayList<>(); //array that will keep the prime factorization
		int index = 0; 	// array index
		int prime = 2;	// first prime to try
		
		while(num != 1){
			if(num % prime == 0){
				num = num / prime;
				factor.add(prime);
				index ++;
			}else{
				prime = getNextPrime(prime, num);
			}
		}
		
		return factor;
	}
	
	public int getNextPrime(int prime, int num){
		if(checkPrime(num)){
			prime = num;
		}else{
			prime++;
			while(!checkPrime(prime) && prime < num){
				prime++;
			}
		}
		return prime;
	}
	
	public boolean checkPrime(int num){
		boolean check = true;
		for(int i = 2; i < num && check; i++){
			if(num % i == 0){
				check = false;
			}
		}
		return check;
	}
	
	public void printArr(int[] arr){
		
	}

	public static void main(String[] args) {
		int n = 999999999;
		ArrayList factor = new ArrayList<>();
		Prime_Factorization prime = new Prime_Factorization();
		factor = prime.findPriceFactor(n);
		System.out.println(factor.toString());
	}
}
