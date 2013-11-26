import java.io.*;

public class Fibonacci_MOD {

	public static void main( String args[] ) throws IOException {

		BufferedReader console = new BufferedReader( new InputStreamReader( System.in ) );

		int current, previous1, previous2, counter, nthFibonacci;

		System.out.print( "Enter the first fibonacci number: " );
		previous1 = Integer.parseInt( console.readLine() );

		System.out.print( "Enter the second fibonacci number: " );
		previous2 = Integer.parseInt( console.readLine() );

		System.out.print( "Enter the desired fibonacci number: " );
		nthFibonacci = Integer.parseInt( console.readLine() );

		counter = 3;

		while( counter <= nthFibonacci ) {

			current = previous2 + previous1;
			previous1 = previous2;
			previous2 = current;
			counter ++;
		}

		System.out.println( "The " + nthFibonacci + "th Fibonacci number is: " + current );
	}
}