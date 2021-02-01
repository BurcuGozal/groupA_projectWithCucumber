package pojo;

public class User {
	
	private String firstName;
	private String lastName;
	private String address;
	private String zip;
	private String state;
	private String city;
	private String email;
	private String phoneNumber;
	
	public User() {}
	
	public User(String firstName, String lastName, String address, String zip, String state, String city, String email,
			String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zip = zip;
		this.state = state;
		this.city = city;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public User(String address, String zip, String state, String city, String phoneNumber) {
		super();
		
		this.address = address;
		this.zip = zip;
		this.state = state;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
