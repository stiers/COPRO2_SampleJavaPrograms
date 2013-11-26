/**
 * Object Class: Cat
 * @author Ephramar Telog, CK
 */

public class Cat extends Pet {

	public Cat() {
		pet_name = "Cat";
		pet_type = "cat";
	}

	public String type() {
		return ( " is a " + pet_type );
	}

	public void setName( String petName ) {
		pet_name = petName;
	}

	public String getName() {
		return pet_name;
	}
}