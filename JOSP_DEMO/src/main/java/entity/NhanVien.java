package entity;

public class NhanVien {
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String diachi;
	@Override
	public String toString() {
		return "NhanVien [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", diachi=" + diachi + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public NhanVien(String firstName, String lastName, int age, String email, String diachi) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.diachi = diachi;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
 
}
