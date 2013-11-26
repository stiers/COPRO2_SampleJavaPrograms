/**
 * Project Name: Change
 * Project Description: Simple emulation of Cash Register
 * Project Author: Ephramar A. Telog, CK
*/

import java.io.*;

public class Change {

	public static void main( String[] arguments ) throws IOException {

		BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );

		double numberOfItems[] = new double[100];
		double payment = 0, total = 0, tax = 0, cost = 0;

		System.out.print( "Number of Item(s): " );
		int items = Integer.parseInt( input.readLine() );
		System.out.print( "\n" );

		for( int i = 0; i < items; i ++ ) {
			System.out.print( "Item Price: " );
			numberOfItems[i] = Double.parseDouble( input.readLine() );
			total += numberOfItems[i];
		}

		tax = total * 0.06;
		cost = tax + total;

		System.out.println( "\n"+ items +" Item(s)" );
		System.out.println( "Total Sale:       " + total );
		System.out.println( "VAT (6%):         " + tax );
		System.out.println( "Total Amount:     " + cost );
		System.out.println( "____________________________" );

		while( payment < cost ) {
			System.out.print( "\nPlease Enter Your Cash: " );
			payment = Double.parseDouble( input.readLine() );

			if( payment < cost ) {
				System.out.println( "\nInsufficient Fund!" );
			}

			else {
				System.out.println( "____________________________" );
				System.out.println( "\nCash:      " + payment );
				System.out.println( "Change:    " + ( payment - cost ) );
				System.out.println( "\nThank You!" );
				System.out.println( "Please Come Again!" );
			}
		}
	}
}