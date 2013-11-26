/**
 * Object Class: Dog
 * @author Ephramar Telog, CK
 */

public class Dog extends Pet {

	public Dog() {
		pet_name = "Dog";
		pet_type = "dog";
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