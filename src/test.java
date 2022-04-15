import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
	private int a = 2;
	
	
	public static void main(String[] args) throws ParseException {
		Date dateBirth=new SimpleDateFormat("yyyy-mm-dd").parse("2003-10-22"); 
        Date dateNow = new Date();
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(dateBirth));
        int d2 = Integer.parseInt(formatter.format(dateNow));
        double age = (d2 - d1) / 10000;
        System.out.println(age);
	}

}
