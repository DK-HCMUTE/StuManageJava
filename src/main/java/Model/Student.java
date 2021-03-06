package Model;

public class Student {
	private int id;
	private String name;
	private String email;
	private double point;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}		
	public double getPoint() {
		return point;
	}
	
	public void setPoint(double point) {
		this.point = point;
	}
	public Student(int id, String name, String email, double point) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.point = point;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", Point=" + point + "]";
	}
	
}
