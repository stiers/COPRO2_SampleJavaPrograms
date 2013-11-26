import java.io.*;

public class FileDemo {

	public static void main( String args[] ) {

		File myFile = new File( "U:/COPRO2", "FileDemo.java" );

		if( myFile.exists() ) {

			System.out.println( myFile.getParent() + "\\" + myFile.getName() + " exists" );
			System.out.println( "The file is " + myFile.length() + " bytes long" );

			if( myFile.canRead() )
				System.out.println( "OK to read" );
			else
				System.out.println( "Not OK to read" );

			if( myFile.canWrite() )
				System.out.println( "OK to write" );
			else
				System.out.println( "Not OK to write" );
		}
		else
			System.out.println( "File does not exist" );
	}
}