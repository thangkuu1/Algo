package spoj;

import java.util.ArrayList;

public class Divisor_summation {
	
	
	
	public ArrayList<Integer> getProperDivisor(int number){
		ArrayList<Integer> arr_div = new ArrayList<>();
		for(int i = 1; i < number; i++){
			if(number % i == 0){
				arr_div.add(i);
			}
		}
		return arr_div;
	}
	
	public int divSum(int number){
		int result = 0;
		for(int i = 1; i < number; i++){
			
			if(number % i == 0){
				result += i;
			}
		}
		
		
		return result ;
	}
	
	public static void main(String[] args) {
		Divisor_summation div_sum = new Divisor_summation();
		ArrayList<Integer> arr = new ArrayList<>();
		arr = div_sum.getProperDivisor(36);
		System.out.println("--------");
		for(int i = 0; i < arr.size(); i ++){
			System.out.println(arr.get(i));
		}
		System.out.println("--------");
		Long time_start = System.currentTimeMillis();
		System.out.println(div_sum.divSum(500000));
		Long time_end = System.currentTimeMillis();
		System.out.println("time: " + (time_end - time_start ));
		
	}
}
