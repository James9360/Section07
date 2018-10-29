public class Person{
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Person() {
		
	}

	public Person(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		else if(o == null || o.getClass()!= this.getClass())
			return false;

		// type casting of the argument.
		Person person = (Person) o;

		// comparing the state of argument with
		// the state of ‘this’ Object.
		return (person.firstName.equals(this.firstName) && person.lastName == this.lastName) && (person.getID() == this.getID());
	}
	
	public int hashCode() {
		return id;
	}
	
	public String getID() {
		return firstName;
	}
	
	public String getFirst() { 
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}

	
	public String toString() {
		return firstName + " " + lastName + "(id=" + id + ")";
	}
}
