/**
 * Odd-Even Numbers
 * @author Ephramar A. Telog, CK
 */

import java.io.*;

public class OddEven {

	public static void main( String args[] ) throws IOException {

		BufferedReader console = new BufferedReader( new InputStreamReader( System.in ) );

		int input;

		while(true) {

			System.out.print( "Enter a number: " );

			input = Integer.parseInt( console.readLine() );

			// Calls to a boolean function
			if( input % 2 == 0 ? printEven() : printOdd() );
		}
	}

	static boolean printOdd() {
		System.out.println( "That's an Odd Number\n" );
		return false;
	}
	static boolean printEven() {
		System.out.println( "That's an Even Number\n" );
		return true;
	}
}