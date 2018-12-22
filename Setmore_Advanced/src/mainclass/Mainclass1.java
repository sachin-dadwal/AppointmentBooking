package mainclass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import test.StringGenration;
import user.User;

public class Mainclass1  {
	static Scanner sc = new Scanner(System.in);
	static User c1 = new User();

	// Valid name method to throw the exception
	public static boolean validname(String s) {
		boolean res = true;
		try {
			Integer n = Integer.parseInt(s);
		} catch (Exception E) {
			res = false;
		}
		return res;
	}

	// Check name method and it will throw the exception
	static public void checkName() {
		System.out.println("Enter your name");
		String s = sc.next();
		if (validname(s)) {
			try {
				throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Enter the correct name");
				checkName();
			}
		}
		c1.setcName(s);
	}

	// Check age method and it will also throw the exception
	static public void checkAge() {
		System.out.println("Enter your age:");
		try {
			String age = sc.next();
			int age1 = Integer.parseInt(age);
			c1.setcAge(age);
		} catch (NumberFormatException e1) {
			System.out.println("Invalid");
			System.out.println("Enter your age in numbers.!!!");
			checkAge();
		}
	}

	// Check mobile method and it will also throw the exception
	static public void checkMobile() {
		System.out.println("Enter your mobile number:");
		String ph = sc.next();
		if (Taco3.validnumber(ph)) {
			c1.setcMobilenumber(ph);
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Invalid number");
				System.out.println("Enter a valid number");
				checkMobile();
			}
		}
	}

	// check email method and it will throw the exception
	static public void checkEmail() {
		System.out.println("Enter your Email id");
		String s0 = sc.next();
		String s2 = s0.toLowerCase();
		if (Taco2.validemail(s2)) {
			c1.setcEmail(s2);
			System.out.println("Congratulations !!");
			// System.out.println("Your appointment got booked for 15 mins at"+ t + "With
			// Doctor Mo");
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Invlid Email !!!");
				System.out.println("Enter a valid email");
				checkEmail();
			}
		}
	}

	// method given to user enter the details and validate them
	static void useroption(LocalTime t) {
		checkName();
		checkAge();
		checkMobile();
		checkEmail();
		// File creation to store the patient details
		File f2 = new File("Patient.txt");
		boolean empty = f2.length() == 0;
		String patientID = IDGen.randomString(5);
		// Checking if file is empty if it is empty then store the content in the
		// file.and if file is not empty then goto the else part
		if (empty) {
			try {
				f2.setWritable(true);// setting the content of the file to true to allow to write.
				FileWriter fw = new FileWriter(f2);
				FileOutputStream fo = new FileOutputStream(f2);
				// fw.write(map);
				fw.write("Patient details Table\n\r");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write("Patient id" + "\t" + "Patient Name" + "\t" + "Patient Age" + "\t" + "Patient Email" + "\t"
						+ "Patient Contact Number");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write(patientID + "\t\t" + c1.getcName() + "\t\t" + c1.getcAge() + "\t\t" + c1.getcEmail() + "\t"
						+ c1.getcMobilenumber());
				// fw.write(c1.getcAge());
				fw.write("\n\r");
				// fw.write("\n\r");
				fw.flush();
				fw.close();
				// System.out.println("Content written sucessfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// This part will check if the file is not empty then continue to save the data
		// in the file .
		else {

			FileWriter fw;
			try {
				// Constructs a FileWriter object given a File object.
				// If the second argument is true, then bytes will be written to the endof the
				// file rather than the beginning.
				fw = new FileWriter("Patient.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				// bw.write("This is just to check how it is working");
				bw.newLine();
				fw.write("\n\r");
				bw.write(patientID + "\t\t" + c1.getcName() + "\t\t" + c1.getcAge() + "\t\t" + c1.getcEmail() + "\t"
						+ c1.getcMobilenumber());
				fw.write("\n\r");
				// fw.write("\n\r");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// Here creating the date object
		Date date = new Date();
		// System.out.println( date);
		// Formating the date into "yyyy/MM/dd" format
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		// Passing the Date object into the DateFormat and storing into String
		String d1 = dateFormat.format(date);
		// String s=d.toString();
		// System.out.println(d1);

		// This method is will return the next day date if you enter the any date.
		// System.out.println(Test1.getNextDate(d1));

		// Generating the appointment ID and storing it in a variable.
		String appointmentID = IDGen.randomString(5);

		System.out.println(c1.getcName()+"(ID "+patientID+")"+",your appointment got booked for 15 mins at " + t + " with Doctor "+ Doctors.Doctor1
				+"(ID "+Doctors.doctorID+")"+ " on " + Test1.getNextDate(d1) + " at " + date + " with Appointment ID " + appointmentID + " .");

		// Now creating a file to store the appointment information
		File f3 = new File("Appointment.txt");

		// File file = new File(path);
		// boolean empty = !file.exists() || file.length() == 0;

		// Again checking the if the file is empty if yes then writing the content in
		// the file and otherwise go to else part.
		boolean empty1 = f3.length() == 0;

		if (empty1) {
			try {
				f3.setWritable(true);
				FileWriter fw = new FileWriter(f3);
				FileOutputStream fo = new FileOutputStream(f3);

				fw.write("Appointment details Table\n\r");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write("Appointment id:" + "\t" + "DoctorName:" + "\t" + "Appointment charge:" + "\t" + "Department:"
						+ "\t" + "Appointment duration" + "\t" + "Appointment date:" + "\t" + "Patient Name:");
				fw.write("\n\r");
				fw.write("\n\r");
				fw.write(appointmentID + "\t\t" + Doctors.Doctor1 + "\t\t" + "$" + Doctors.price1 + "\t\t\t"
						+ Doctors.dept1 + "\t\t" + Doctors.duration + " minutes." + "\t\t" + Test1.getNextDate(d1)
						+ "\t\t" + c1.getcName());
				fw.write("\n\r");
				// fw.write("\n\r");
				// fw.write(c1.getcAge());
				fw.flush();
				fw.close();
				// System.out.println("Content written sucessfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

			FileWriter fw;
			try {
				// if the file is not empty then start writing in the file at the end rather
				// then at begin.
				fw = new FileWriter("Appointment.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				// bw.write("This is just to check how it is working");
				bw.newLine();
				fw.write("\n\r");
				fw.write(appointmentID + "\t\t" + Doctors.Doctor1 + "\t\t" + "$" + Doctors.price1 + "\t\t\t"
						+ Doctors.dept1 + "\t\t" + Doctors.duration + " minutes." + "\t\t" + Test1.getNextDate(d1)
						+ "\t\t" + c1.getcName());
				fw.write("\n\r");
				// fw.write("\n\r");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println(
				"===========================================================================================================================================================================================================");
		System.out.println("\n>>>> Welcome to " + Doctor.Clinic + " <<<<\n");
		System.out.println(
				"===========================================================================================================================================================================================================");
		do
		{
		System.out.println("\nPlease Select the Doctors for \n1. Cardiologists\r\n" + "2. Neurologists\r\n"
				+ "3. Search\r\n" /* +\r\n" + "4. ENT\r\n" + "5. Skin specialists" */);
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				// Doctors.selectCardiologists("","");
				LocalTime t = Doctors.selectCardiologists();
				useroption(t);
				break;
			}
			case 2: {

				LocalTime t = Doctors.selectNeurologists();
				useroption(t);
				break;
			}
			case 3: {
				SearchID.main(args);
				break;
			}
			default: {
				try {
					throw new InputMismatchException();
				} catch (InputMismatchException e) {
					System.out.println("Invalid choice");
					System.out.println("Please enter a correct option");
					main(args);
					break;
				}
			}
			}
		} catch (Exception e) {
			System.out.println("Invalid choice");
			System.out.println("Please enter a correct input, enter only numbers.");
			// main(args);
			 

		}
		}
		while(1>0);
	}

}

/*
 * case 3: { Doctors.selectOrthopaedic(); break; } case 4: {
 * Doctors.selectENT(); break;
 * 
 * } case 5: { Doctors.selectSkinSpecialists();
 * 
 * }
 */
