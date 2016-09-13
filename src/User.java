import java.io.File;


public class User extends Person
{
	private String usrName, pw, email;
	private long phone;
	private File pic;
	public User(String firstName, String lastName, String gender,
			long socialSecurityNumber, Date dateOfBirth, String userName, String password, String email, long phoneNumber, File picture) {
		super(firstName, lastName, gender, socialSecurityNumber, dateOfBirth);
		// TODO Auto-generated constructor stub
		this.pic = picture;
		this.phone = phoneNumber;
		this.pw = password;
		this.usrName = userName;
		this.email = email;
	}
	public String getUserName()
	{
		return usrName;
	}
	public boolean checkPassword(String p)
	{
		return p.equals(pw);
	}
	public String values()
	{
		String tday = ""+dob.getDay();
		String tmonth = ""+dob.getMonth();
		if(tday.length()!=2)
		{tday = "0"+tday;}
		if(tmonth.length()!=2)
		{tmonth = "0"+tmonth;}
		return fName+"<>"+lName+"<>"+gender+
				"<>"+ssn+"<>"+dob.getYear()+tday+tmonth+"<>"+usrName+"<>"+ pw +"<>"
				+email+"<>"+phone+"<>"+pic;
	}

}
