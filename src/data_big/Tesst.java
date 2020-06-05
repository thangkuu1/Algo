package data_big;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tesst {
	public static void main(String[] args) {
		String[] arr = {"1","2", "1", "2"};
		HashMap<String, List<String>> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			if(map.containsKey(arr[i])){
				List<String> list = new ArrayList<String>();
				list.add(arr[i]);
				list.addAll(map.get(arr[i]));
				map.put(arr[i], list);
			}else{
				List<String>list_ = new ArrayList<>();
				list_.add(arr[i]);
				map.put(arr[i], list_);
			}
		}
//		for(int a: arr){
//			if(map.containsKey(a)){
//				List<Integer> list = new ArrayList<Integer>();
//				list.add(a);
//				list.addAll(map.get(a));
//				map.put(a, list);
//			}else{
//				List<Integer>list_ = new ArrayList<>();
//				list_.add(a);
//				map.put(a, list_);
//			}
//		}
		System.out.println(map);
		for(String s: map.keySet()){
			System.out.println(s);
			System.out.println(map.get(s));
		}
//		for(List<String> s1: map.values()){
//			System.out.println(s1);
//		}
	}

}
