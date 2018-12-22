package mainclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class AppointmentSearch extends SearchID{
	
	
	
	
    public static void main(String[] args)  {
    	File f1=new File("Appointment.txt");
    	System.out.println("Enter the Appointment ID:");
		Scanner sc= new Scanner(System.in);
		String yo=sc.next();
    	//String yo = "pGE5N";
    	System.out.println("Appointment id:" + "\t" + "DoctorName:" + "\t" + "Appointment charge:" + "\t" + "Department:"
				+ "\t" + "Appointment duration" + "\t" + "Appointment date:" + "\t" + "Patient Name:");
    	System.out.println();
    	AppointmentSearch w= new AppointmentSearch();
    	w.displayDetails(f1, yo);
    	//PatientSearch.main(args);
    	
    }
}
    	
    	/*File f1=new File("C:\\Users\\User\\eclipse-workspace\\Setmore_Advanced\\Appointment.txt");
    	FileReader r1= new FileReader(f1);
    	BufferedReader br=new BufferedReader(r1);
        String yo = "pGE5N";
        Boolean res=false;
         String line =br.readLine();
       
        while (line!=null)
        {
	      // System.out.println(line);
	        if(line.indexOf(yo)!=-1)
	        {res=true;
	        	
	            System.out.println(line);
	       // line=br.readLine();
	        }
	        line=br.readLine();
	        
	        else
	        {
	        //	System.out.println("Fail");
	        }
	        
        }
        if(res==false)
        {
        System.out.println("No details found, key does not exists !!");
        }
        }
      
}*/