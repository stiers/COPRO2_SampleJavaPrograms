/**
 * @author Ephramar Telog, CK
 */

import java.io.*;

public class GuestList extends Guest {

	public static void main( String args[] ) throws IOException {

		BufferedReader console = new BufferedReader( new InputStreamReader( System.in ) );

		Guest p = new Guest(); // initializes the object

		int guestAge = 0;
		String guestName, guestAddress, choice;
		String guestList[] = new String[50];

		int i = 0; // counter

		System.out.println( "Guest List\n" );

		// added for precision
		while( true ) {

			System.out.print( "Gender Type: " );

			choice = console.readLine();

			if( choice.equalsIgnoreCase( "m" ) ) {

				System.out.print( "Enter Name: " );
				guestName = console.readLine();

				System.out.print( "Enter Age: " );
				try { guestAge = Integer.parseInt( console.readLine() ); }
				catch( NumberFormatException e ) {
					System.out.println( "Not a number!\n" );
					continue;
				}

				System.out.print( "Enter Address: " );
				guestAddress = console.readLine();

				guestList[i] = "Mr. " + p.name( guestName ) + p.age( guestAge ) + " years old of " + p.address( guestAddress );

				System.out.println();
			}

			else if( choice.equalsIgnoreCase( "f" ) ) {

				System.out.print( "Enter Name: " );
				guestName = console.readLine();

				System.out.print( "Enter Age: " );
				try { guestAge = Integer.parseInt( console.readLine() ); }
				catch( NumberFormatException e ) {
					System.out.println( "Not a number!" );
					continue;
				}

				System.out.print( "Enter Address: " );
				guestAddress = console.readLine();

				guestList[i] = "Ms. " + p.name( guestName ) + p.age( guestAge ) + " years old of " + p.address( guestAddress );

				System.out.println();
			}

			else if( choice.equalsIgnoreCase( "DONE" ) ) {

				System.out.print( "\n" ); // added for precision

				System.out.println( "List of Guest(s)\n" );

				for( int j = 0; j < i; j ++ ) {
					System.out.println( guestList[j] );
				}

				System.out.print( "\n" ); // added for precision

				break; // breaks the loop and terminates the program
			}

			else {
				System.out.println( "\nM for Male, F for Female" );
				System.out.println( "DONE to terminate the program\n" );

				//i --; // force to decrement the counter by 1 to ensure precision
			}

			++i; // force the counter to increment by 1 to increase array size

		} // end while
	} // end main
} // end class