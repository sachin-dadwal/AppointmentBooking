package mainclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test1
{
	
	
	
	public static String getNextDate(String  curDate)  {
		  final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		  Date date = null;
		
			try {
				date = format.parse(curDate);
			} catch (ParseException e) {
				System.out.println("Enter the right date");
				
				
			}
		
		  final Calendar calendar = Calendar.getInstance();
		  calendar.setTime(date);
		  calendar.add(Calendar.DAY_OF_YEAR, 1);
		  return format.format(calendar.getTime()); 
		}
	
	
	
	
	
	
	public static void main(String[] args) throws ParseException {
		
		Map<Integer,String> map =new HashMap<>();
		
		map.put(1, "hello");
		System.out.println(map);
		map.remove(1);
		System.out.println(map);
	
		DateFormat dateFormat1 = new SimpleDateFormat("d/M/Y");
	
		//System.out.println(dateFormat.format(date));
		//System.out.println(dateFormat1.format(date));
		Date d= new Date();
		System.out.println(d);
		System.out.println("--------------");
		System.out.println(getNextDate("2018/09/11"));
		System.out.println(d);
		
		System.out.println("============================================");
		Date date=new Date();
		
		System.out.println("hello"+date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String d1=dateFormat.format(date);
		//String s=d.toString();
		System.out.println(d1);
	    System.out.println(getNextDate(d1));	
		System.out.println("============================================");
		
	}

}
