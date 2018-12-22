package mainclass;

import java.io.File;
import java.util.Scanner;

public class PatientSearch extends SearchID {
	
	public static void main(String[] args) {
		File f1= new File("Patient.txt");
		System.out.println("Enter the Patient ID:");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		System.out.println("Patient id" + "\t" + "Patient Name" + "\t" + "Patient Age" + "\t" + "Patient Email" + "\t"
						+ "Patient Contact Number");
		System.out.println();
		PatientSearch p=new PatientSearch();
		p.displayDetails(f1, s);
		
	}

}
