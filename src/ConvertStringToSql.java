import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class ConvertStringToSql {

	public static void main(String[] args) throws IOException {
		
		 String s = "3127691,3127738,3127749,3127757,3127761,3127764,3127777,3127840,3127855,";
		 String[] arr = s.split(",");
		 StringBuffer sb = new StringBuffer();
		 for(int i = 0; i < arr.length; i++){
			 sb.append("'"+ arr[i] + "',");
		 }
		 System.out.println(sb);
	}

}
