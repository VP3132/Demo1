package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderTest1 {

	public static void main(String[] args) throws Exception {
		String date = "12-Feb-2021";
		SimpleDateFormat spldate = new SimpleDateFormat("dd-MMM-yyyy");
		Date finaldate = spldate.parse(date);
		System.out.println(finaldate);
	}

}
