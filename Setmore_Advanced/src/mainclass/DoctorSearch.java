package mainclass;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class DoctorSearch extends SearchID
{
public static void main(String[] args) {
	File f1= new File("Doctor.txt");
	System.out.println("Enter the Doctor ID:");
	Scanner sc= new Scanner(System.in);
	String s=sc.next();
	System.out.println("Doctor id"+"\t"+"Doctor Name"+"\t"+"Appointment Charge"+"\t"+"Dept"+"\t\t"+"Appointment Duration");
	System.out.println();
	DoctorSearch d=new DoctorSearch();
	d.displayDetails(f1, s);
	
	
}
}
