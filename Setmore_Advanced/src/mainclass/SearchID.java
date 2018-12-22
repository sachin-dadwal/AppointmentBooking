package mainclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SearchID implements Doctor {
	
	public void displayDetails(File f,String s)
	{
	try {
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String string=s;
		boolean res=false;
		String line=br.readLine();
		while(line!=null)
		{
			if(line.indexOf(string)!=-1)
			{
				res=true;
				
				System.out.println(line);
			}
			line=br.readLine();
		}
		if(res==false)
		{
			 System.out.println("No details found, key does not exists !!");
		}	
	} catch (IOException e) {//FileNotFoundException | IOException e
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the option to search:");
		System.out.println("\n1.Search by AppointmentID\n2.Search by PatientID\n3.Search by DoctorID");
		try
		{
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
		{
			AppointmentSearch.main(args);
			break;
		}
		case 2:
		{
			PatientSearch.main(args);
			break;
		}
		case 3:
		{
			DoctorSearch.main(args);
			break;
		}
		default:
		{
			System.out.println("Invalid option");
			System.out.println("Please select the correct option");
			System.out.println("********************************");
			main(args);
		}
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Incorrect choice");
			System.out.println("Please select the correct option");
			System.out.println("********************************");
			main(args);
		}
		
	}
	

}
