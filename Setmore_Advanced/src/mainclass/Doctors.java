package mainclass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Doctors {

	static Scanner sc = new Scanner(System.in);
	static String Doctor1 = null;
	static double price1 = 0.00;
	static String dept1 = null;
	static int duration = 0;
	static String doctorID=null;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static LocalTime generateslots(String s1, String s2, String t1, String t2, int slotsize, double price,
			String dept) {
		LocalTime l = null;
		do {
			System.out.println("Select the doctor\n1. Doctor " + s1 + "\n2. Doctor " + s2);
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				// System.out.println("Working hours"+s1+" to"+s2);
				Doctor1 = s1;
				duration = slotsize;
				System.out.println("Doctor :" + Doctor1);
				System.out.println("Appointment charge: $" + price);
				System.out.println("Working hours: " + t1 + " to " + t2 + ".");
				System.out.println("Appointment duration: " + duration + " minutes.\n");
				price1 = price;
				//System.out.println(price1);
				dept1 = dept;
				//System.out.println(dept1);
				if (t1.equals("07:00")) {
					l = storage.Doctor.printTimeSlots1(LocalTime.parse(t1), LocalTime.parse(t2), slotsize);
					File f1 = new File("Doctor.txt");
					boolean empty = f1.length() == 0;
					 doctorID = IDGen.randomString(5);
					if (empty) {
						try {
							f1.setWritable(true);
							FileWriter fw = new FileWriter(f1);
							FileOutputStream fo = new FileOutputStream(f1);
							/*price1 = price;
							dept1 = dept;*/
							price1 = price;
							System.out.println(price1);
							dept1 = dept;
							System.out.println(dept1);
							/*fw.write("Doctor details\n\r");
							fw.write("\n\r");
							fw.write("Doctor Name: " + Doctor1 + "\t" + "Appointment charge: " + price1 + "\t "
									+ "Dept: " + dept1 + "\t" + "Appointment duration: " + duration + "\t");*/
							
							
							fw.write("Doctor details Table\n\r");
							fw.write("\n\r");
							fw.write("\n\r");
							fw.write("Doctor id"+"\t"+"Doctor Name"+"\t"+"Appointment Charge"+"\t"+"Dept"+"\t\t"+"Appointment Duration");
							fw.write("\n\r");
							fw.write("\n\r");
							fw.write(doctorID+"\t\t" + Doctor1 + "\t\t" + "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
							
							//fw.write("\n\r");
							//fw.write("\n\r");
							
							
							
							
							
							
							
							
							fw.flush();
							fw.close();
							// System.out.println("Content written sucessfully");
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						FileWriter fw;
						try {
							fw = new FileWriter("Doctor.txt", true);
							BufferedWriter bw = new BufferedWriter(fw);
							// bw.write("This is just to check how it is working");
							bw.newLine();
							fw.write("\n\r");
							fw.write("\n\r");
							fw.write(doctorID+"\t\t" + Doctor1 + "\t\t"+ "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
							fw.write("\n\r");
							
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}

				else {
					l = storage.Doctor.printTimeSlots(LocalTime.parse(t1), LocalTime.parse(t2), slotsize);

					File f1 = new File("Doctor.txt");
					boolean empty = f1.length() == 0;
					 doctorID = IDGen.randomString(5);
					if (empty) {
						try {
							f1.setWritable(true);
							FileWriter fw = new FileWriter(f1);
							FileOutputStream fo = new FileOutputStream(f1);
							price1 = price;
					//		System.out.println(price1);
							dept1 = dept;
						//	System.out.println(dept1);
							// fw.write(map);
							fw.write("Doctor details Table\n\r");
							fw.write("\n\r");
							fw.write("\n\r");
							fw.write("Doctor id"+"\t"+"Doctor Name"+"\t"+"Appointment Charge"+"\t"+"Dept"+"\t\t"+"Appointment Duration");
							fw.write("\n\r");
							fw.write("\n\r");
							fw.write(doctorID+"\t\t" + Doctor1 + "\t\t"+ "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
							fw.write("\n\r");
							
							fw.flush();
							fw.close();
							// System.out.println("Content written sucessfully");
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else {
						FileWriter fw;
						try {
							fw = new FileWriter("Doctor.txt", true);
							BufferedWriter bw = new BufferedWriter(fw);
							// bw.write("This is just to check how it is working");
							bw.newLine();
							fw.write("\n\r");
							fw.write(doctorID+"\t\t" + Doctor1 + "\t\t"+ "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
							fw.write("\n\r");
							// fw.write("\n\r");
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
				break;

			case 2: {
				Doctor1 = s2;
				price1 = price;
				//System.out.println(price1);
				dept1 = dept;
				//System.out.println(dept1);
				duration = slotsize;
				System.out.println("Doctor :" + Doctor1);
				System.out.println("Appointment charge: $" + price);
				System.out.println("Working hours: " + t1 + " to " + t2 + ".");
				System.out.println("Appointment duration: " + duration + " minutes.\n");

				if (t1.equals("14:00")) {
					l = storage.Doctor.printTimeSlots(LocalTime.parse(t1), LocalTime.parse(t2), slotsize);
					File f1 = new File("Doctor.txt");
					
					boolean empty = f1.length() == 0;
					 doctorID = IDGen.randomString(5);
					if (empty) {
					try {
						f1.setWritable(true);
						FileWriter fw = new FileWriter(f1);
						FileOutputStream fo = new FileOutputStream(f1);
						fw.write("Doctor details Table\n\r");
						fw.write("\n\r");
						fw.write("\n\r");
						fw.write("Doctor id"+"\t"+"Doctor Name"+"\t"+"Appointment Charge"+"\t"+"Dept"+"\t\t"+"Appointment Duration");
						fw.write("\n\r");
						fw.write("\n\r");
						fw.write(doctorID+"\t\t" + Doctor1 + "\t\t"+ "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
						fw.write("\n\r");
						// fw.write(c1.getcAge());
						fw.flush();
						fw.close();
						// System.out.println("Content written sucessfully");
					} catch (IOException e) {
						e.printStackTrace();
					}
					}
					else
					{
						FileWriter fw;
						try {
							fw = new FileWriter("Doctor.txt", true);
							BufferedWriter bw = new BufferedWriter(fw);
							// bw.write("This is just to check how it is working");
							bw.newLine();
							fw.write("\n\r");
							fw.write(doctorID+"\t\t" + Doctor1 + "\t\t"+ "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
							fw.write("\n\r");
							// fw.write("\n\r");
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				} else {
					l = storage.Doctor.printTimeSlots1(LocalTime.parse(t1), LocalTime.parse(t2), slotsize);
					File f1 = new File("Doctor.txt");
					boolean empty = f1.length() == 0;
					 doctorID = IDGen.randomString(5);
					if (empty) {
					try {
						f1.setWritable(true);
						FileWriter fw = new FileWriter(f1);
						FileOutputStream fo = new FileOutputStream(f1);
						fw.write("Doctor details Table\n\r");
						fw.write("\n\r");
						fw.write("\n\r");
						fw.write("Doctor id"+"\t"+"Doctor Name"+"\t"+"Appointment Charge"+"\t"+"Dept"+"\t\t"+"Appointment Duration");
						fw.write("\n\r");
						fw.write("\n\r");
						fw.write(doctorID+"\t\t" + Doctor1 + "\t\t" + "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
						fw.write("\n\r");
						// fw.write(c1.getcAge());
						fw.flush();
						fw.close();
						// System.out.println("Content written sucessfully");
					} catch (IOException e) {
						e.printStackTrace();
					}
					}
					else
					{
						FileWriter fw;
						try {
							fw = new FileWriter("Doctor.txt", true);
							BufferedWriter bw = new BufferedWriter(fw);
							// bw.write("This is just to check how it is working");
							bw.newLine();
							fw.write("\n\r");
							fw.write(doctorID+"\t\t" + Doctor1 + "\t\t"+ "$" + price1 + "\t\t"+ dept1 + "\t\t" + duration );
							fw.write("\n\r");
							// fw.write("\n\r");
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

				break;
			}
			default: {
				try {
					throw new InputMismatchException();
				} catch (InputMismatchException e) {
					System.out.println("Invalid choice");
					System.out.println("Please enter a correct option");
					// selection();
				}
				break;
			}

			}
			return l;
		} while (1 > 0);
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static LocalTime selectCardiologists() {
		LocalTime l = generateslots("Amul", "Arya", "07:00", "14:00", 15, 100.00, "Cardiologists");
		return l;
	}

	static LocalTime selectNeurologists() {
		// System.out.println("Select the doctor \n1. Doctor Gupta\n2. Doctor Arya");
		LocalTime l = generateslots("Ram", "Rajeev", "14:00", "21:00", 15, 100.00, "Neurologists");
		return l;
	}

	/*
	 * static void selectOrthopaedic() {
	 * System.out.println("Select the doctor \n1. Doctor Rahul\n2. Doctor Gopal"); }
	 * static void selectENT() {
	 * System.out.println("Select the doctor \n1. Doctor Johnson\n2. Doctor Lilly");
	 * } static void selectSkinSpecialists() {
	 * System.out.println("Select the doctor \n1. Doctor John\n2. Doctor Paris"); }
	 */
	public static void main(String[] args) {
		generateslots("Ram", "Rajeev", "07:00", "14:00", 15, 100.00, "Doctors");
	}

}
