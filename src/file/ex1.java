package file;

import java.io.File;
import java.io.IOException;

public class ex1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/document/21.Algorithm");
		File file = new File("C:/Users/thangnd3/Desktop/thangtest1.txt");
		if(file.createNewFile()){
			System.out.println("Create file success");
			System.out.println(file.getAbsolutePath());
		}else{
			System.out.println("Create file error");
		}
		String[] fileName = f.list();
		for(String file1 : fileName){
			System.out.println(file1);
		}
	}
}
