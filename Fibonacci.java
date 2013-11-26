/**
 * Operations on Fibonacci Sequence
 * @author Ephramar A. Telog
 */

import java.io.*;

public class Fibonacci {

	public static void main( String args[] ) throws IOException {

		BufferedReader console = new BufferedReader( new InputStreamReader( System.in ) );

		// Variables
		int fFibNum, sFibNum, nth;

		System.out.print( "Enter the first fibonacci number: " );
		fFibNum = Integer.parseInt( console.readLine() );

		System.out.print( "Enter the second fibonacci number: " );
		sFibNum = Integer.parseInt( console.readLine() );

		System.out.print( "Enter the desired fibonacci number: " );
		nth = Integer.parseInt( console.readLine() );

		// Call the function
		System.out.print( "The fibonacci number is: " + ( rFibNum( fFibNum, sFibNum, nth ) ) + "\n" );
	}

	/**
	 * Uses recursive process in extracting fibonacci sequence
	 */
	public static int rFibNum( int a, int b, int n ) {

		if( n == 1 ) {
			return a;
		}
		else if( n == 2 ) {
			return b;
		}
		else {
			return rFibNum( a, b, n - 1 ) + rFibNum( a, b, n - 2 );
		}
	}
}