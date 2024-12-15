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
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		sdf.format(date);
		System.out.println(sdf.format(date));
		
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -1);      // Add 1 day
		SimpleDateFormat sdfs = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        sdfs.format(cal.getTime());
		System.out.println(sdfs.format(cal.getTime()));


	}

}
