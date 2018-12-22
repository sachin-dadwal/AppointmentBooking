
package mainclass;

import java.util.Scanner;

public class Taco2 {
	
	public static boolean validemail(String s1) {
		boolean res=false;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email id:");
		
		String s1 = sc.nextLine();*/
		String s=s1.toLowerCase();
		
		try
		{
			//long n=Long.parseLong(s);
		char[] ch = s.toCharArray();
		
		
		
		if(!(s.contains("@")))
			
				{
			System.out.println("Enter the valid email");
			
			}
			else
			{
				
				if(s.endsWith(".com")||s.endsWith(".co")||s.endsWith(".io"))
				{
			
			for (int i = 0; i < ch.length; i++) {
				// System.out.print(ch[i]+" ");
				// System.out.println();
				
					
				
				for (char c = 97; c < 123; c++) {
					
					if (ch[i] == c )
					{
						/*System.out.print(c + " ");
						System.out.println(c1+" ");*/
						//System.out.println("true");
						res=true;
						
				}
				}
			}
			}
		
		else
		{
			System.out.println("Enter the valid email");
		}
		}
		}
		catch(Exception E)
		{
			//System.out.println("Invalid Number");
			//System.out.println("Please, Enter the correct value");
		}
		return res;
		
		
	}
	public static void main(String[] args) {
		System.out.println(validemail("sachin324n@gmail.com"));
	}

}
