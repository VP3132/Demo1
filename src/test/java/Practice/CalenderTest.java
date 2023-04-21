package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderTest {

	public static void main(String[] args) throws Exception {
		String Date = "12-Feb-2023";
		SimpleDateFormat targetdate = new SimpleDateFormat("dd-MMM-yyyy");
		Date finaldate = targetdate.parse(Date);
		System.out.println(finaldate);

	}

}
