/**
 * Abstract Class: Pet
 * @author Ephramar Telog, CK
 */
abstract class Pet {

	protected String pet_name;
	protected String pet_type;

	public String type() {
		return pet_type;
	}

	public void setName( String name ) {
		pet_name = "";
	}

	public String getName() {
		return pet_name;
	}
}