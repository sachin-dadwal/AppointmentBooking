package test;

import java.security.SecureRandom;

public class StringGenration {
	
	public static void main(String[] args) {
		
		System.out.println(randomString(5));
		
	}








static String randomString( int len ){

 final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
 SecureRandom rnd = new SecureRandom();
   StringBuilder sb = new StringBuilder( len );
   for( int i = 0; i < len; i++ ) 
      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
   return sb.toString();
}


}