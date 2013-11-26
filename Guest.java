/**
 * @author Ephramar Telog, CK
 */

public class Guest {

	protected String person_name;
	protected int person_age;
	protected String person_address;

	public String name( String person_name ) {
		return ( person_name + " a " );
	}

	public int age( int person_age ) {
		return person_age;
	}

	public String address( String person_address ) {
		return ( person_address + " City" );
	}

}