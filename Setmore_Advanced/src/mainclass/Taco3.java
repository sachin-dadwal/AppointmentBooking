package mainclass;

import java.util.Scanner;

public class Taco3 {

	public static boolean validnumber(String s) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the number");
		 * String s = sc.nextLine()
		 */
		boolean res = false;
		try {
			long n = Long.parseLong(s);
			char[] ch = s.toCharArray();
			if (s.length() != 10) {
				System.out.println("Please enter 10 digits");
			} else {
				for (int i = 0; i < ch.length; i++) {
					// System.out.print(ch[i]+" ");
					// System.out.println();
					for (char c = 48; c < 58; c++) {

						if (ch[i] == c)// && ch.length == 1
						{
							//System.out.print(c + " ");
							res = true;
						}

					}
				}
			}
		}
		catch (Exception E) {
			System.out.println("Invalid Number");
			//System.out.println("Please, Enter the correct value");
		}

		/*System.out.println(
				"========================================================================================================");*/
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Taco3.validnumber("9988383244"));
	}

}
