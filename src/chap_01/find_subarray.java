package chap_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.Numbet_Obj;

/**
 * Cho dãy số a1, a2, a3, ..., an
 * Dãy số ai, ai+1,..., aj với 1<=i<=j<=n gọi là dãy con của dãy đã cho và tổng của dãy con được gọi là 
 * trọng lượng của dãy con này.
 * 
 * hãy tìm trọng lượng lớn nhất của các dãy con, 
 * 
 * exp: -2,11,-4,13,-5,3 resolve: 11,-4,13 sum = 20
 * @author thangnd3
 *
 */


public class find_subarray {
	public Numbet_Obj num_obj = new Numbet_Obj();
	public List<Numbet_Obj> Sum(int[] n){
		
		int maxSum = 0;
		List<Numbet_Obj> list = new ArrayList<Numbet_Obj>();
		for(int i = 0; i < n.length; i++){
			for(int j = i; j < n.length; j++){
				int sum = 0;
				for(int k = i; k <= j; k++){
					sum += n[k];
				}
				if(sum > maxSum){
					maxSum = sum;
					num_obj.setSum(maxSum);
					num_obj.setI(i);
					num_obj.setJ(j);
					list.add(num_obj);
				}
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		find_subarray f_subarr = new find_subarray();
		int[] n = {-2,11,-4,13,-5,3};
		List<Numbet_Obj> list = new ArrayList<>();
		list = f_subarr.Sum(n);
		int maxSum = 0;
		int start = 0, end = 0;
//		System.out.println("value: " + list.size());
		for(int i = 0; i < list.size(); i++){
			
			if(list.get(i).getSum()> maxSum){
				maxSum= list.get(i).getSum();
				start = list.get(i).getI();
				end = list.get(i).getJ();
			}
		}
		System.out.println(maxSum);
		for(int i = start; i <= end; i++){
			System.out.print(n[i] + ",");
		}
	}
	
	

}
