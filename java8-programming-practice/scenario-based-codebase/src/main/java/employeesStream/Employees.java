package employeesStream;

public class Employees {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int yearOfJoining;
	private double salary;
	
	public Employees(int id, String name, int age, String gender, String dept, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDept() {
		return dept;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
	    return "Employee [" +
	           "id=" + id + 
	           ", name='" + name + '\'' + 
	           ", age=" + age + 
	           ", gender='" + gender + '\'' + 
	           ", dept='" + dept + '\'' + 
	           ", yearOfJoining=" + yearOfJoining + 
	           ", salary=" + salary + 
	           ']';
	}
	
}
