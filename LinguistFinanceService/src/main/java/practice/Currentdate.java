package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Currentdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		date.toString();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		sdf.format(date);
		System.out.println(sdf.format(date));
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdfs = new SimpleDateFormat("MM/dd/yyyy hh:mm:SS");
        sdfs.format(cal.getTime());
		System.out.println(sdfs.format(cal.getTime()));


	}

}
