/**
 * Script for making 10,000 records
 * @reference RandomAccessDemo
 */

import java.io.*;

public class CreateBankFile {

	public static void main( String args[] ) throws Exception {

		BufferedReader $console = new BufferedReader( new InputStreamReader( System.in ) );

		// asks the user to enter the desired folder name
		System.out.print( "Enter folder name: " );

		// reads the folder name entered by the user
		String $user_desired_folder = $console.readLine();

		// points to the user desired folder
		String $user_create_folder = ( "U:/tmp/" + $user_desired_folder + "/" );

		// loop to create 10,000 records
		for( long i = 0; i < 10000; i ++ ) {

			if( i < 10 ) { RandomAccessFile $create_bank_file = new RandomAccessFile( $user_create_folder + "000" + i + ".txt", "rw" ); }
			else if( i >= 10 && i < 100 ) { RandomAccessFile $create_bank_file = new RandomAccessFile( $user_create_folder + "00" + i + ".txt", "rw" ); }
			else if( i >= 100 && i < 1000 ) { RandomAccessFile $create_bank_file = new RandomAccessFile( $user_create_folder + "0" + i + ".txt", "rw" ); }
			else { RandomAccessFile $create_bank_file = new RandomAccessFile( $user_create_folder +  i + ".txt", "rw" ); }

		}

		System.out.print( "Files created. " );

	} // end main
} // end class