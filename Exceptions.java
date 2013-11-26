public class Exceptions {

	public static void main( String args[] ) {

		try {
			System.out.println( "Try Block before the error" );
			System.out.println( 1 / 0 );

			// This will not be displayed
			System.out.println( "Try Block after the error" );
		}

		catch( ArithmeticException e ) {
			System.out.println( "Catch Block" );
			System.out.println( "A Stack Trace of Error:" );
			e.printStackTrace();
			System.out.println( "The operation is not possible" );
		}

		finally {
			System.out.println( "Finally Block" );
		}

	}

}