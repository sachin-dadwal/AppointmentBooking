package mainclass;

import java.io.File;
import java.time.LocalTime;

public interface Doctor
{
	String Clinic="FULL Clinic";
	
	 /*LocalTime generateslots(String s1, String s2, String t1, String t2, int slotsize, double price,
				String dept) ;*/
	// String randomString( int len );
	
	void displayDetails(File f,String s);
	//String randomString( int len );
}
