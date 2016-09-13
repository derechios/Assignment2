
public class Person 
{

	protected String fName, lName, gender;
	protected long ssn;
	protected Date dob;
	public Person(String firstName, String lastName, String gender, long socialSecurityNumber, Date dateOfBirth)
	{
		this.fName = firstName;
		this.lName = lastName;
		this.gender = gender;
		this.ssn = socialSecurityNumber;
		this.dob = dateOfBirth;
	}
}
