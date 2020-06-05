package data_big;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Process {
	
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> hash = new HashMap<>();
		int count = 1;
		FileReader in = new FileReader("D:\\data.txt");
		 Scanner sc = new Scanner(in); 
//		String line = br.readLine();
		while (sc.hasNextLine()) {
			
			String s = sc.nextLine();
//			System.out.println(s);
			s = RemoveCharacter.removeSpecialText(s);
			String[] arr_s = s.split(" ");
			for(String word: arr_s){
				if(hash.containsKey(word)){
					int count_ = hash.get(word) + 1;
					hash.put(word, count_);
				}else{
					hash.put(word, count);
				}
			}
//			line = br.readLine();
			
			
		}
//		br.close();
		System.out.println(hash);
		String search = "the";
		if(hash.containsKey(search)){
			System.out.println("value serch: " + hash.get(search));
		}else{
			System.out.println("no data ");
		}
//		System.out.println();
	}

}
