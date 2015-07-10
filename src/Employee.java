
public abstract class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Employee( String first, String last, String ssn ) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName( String first ) {
		firstName = first;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName( String last ) {
		lastName = last;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber( String ssn ) {
		socialSecurityNumber = ssn;
	}

	@Override
	public String toString() {

		return String.format( "%s %s\nsocial security number:%s ", getFirstName(), getLastName(),
				getSocialSecurityNumber() );
	}

	public abstract double earnings();

}
