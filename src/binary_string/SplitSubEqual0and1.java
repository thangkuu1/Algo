package binary_string;

import java.util.ArrayList;
import java.util.List;

import models.ListNumber;

/*
 * Given the binary string str of length N, the task is to find the maximum count of substrings str can be divided into such that all 
 * the substrings are balanced, they have equal number of 0s and 1s. if it is not possible to split str satisfying the conditions the print -1.
 */
public class SplitSubEqual0and1 {
	
	public ListNumber countSplit(String s){
		ListNumber list_num = new ListNumber();
		List<String> list_str = new ArrayList<>();
		int count_0 = 0;
		int count_1 = 0;
		int count_str = 0;
		int temp = 0;
		int temp_ = 0;
		for(int i = 0; i < s.length(); i++){
			// check if string contain 0 
			if(s.charAt(i) == '0'){
				count_0 ++;
			}else{
				count_1 ++;
			}
			if(count_0 == count_1){
				count_str ++;
				temp_ = i + 1;
				list_str.add(s.substring(temp, temp_));
				list_num.setListSubStr(list_str);
				list_num.setCount(count_str);
				//System.out.println(s.substring(temp, temp_));
				temp = temp_;
			}
		}
		if(count_0 != count_1){
			if(list_num.getCount() == 0  ){
				list_num.setCount(-1);
				list_str.add("No value");
				list_num.setListSubStr(list_str);
			}
			
		}
		list_num.setCount(count_str);
		return list_num;
	}
	
	public static void main(String[] args) {
		String s = "11";
		SplitSubEqual0and1 sse = new SplitSubEqual0and1();
		
		ListNumber  list_number = sse.countSplit(s);
		System.out.println("Count: " + list_number.getCount());
		if(list_number.getListSubStr().size() < 1 || list_number.getListSubStr() == null ){
			System.out.println("No substring");
		}else{
			for(int i = 0; i < list_number.getListSubStr().size(); i++){
				System.out.print(list_number.getListSubStr().get(i) + " | ");
			}
		}
		
	}
	
}
