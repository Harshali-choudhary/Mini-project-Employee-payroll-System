package employee_P;

public abstract class Employee {

	private int id;
	private String name;
	private String address;
	private String mob_no;

	public Employee(int id, String name, String address, String mob_no) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.address = address;
		this.mob_no = mob_no;
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public String getaddress() {
		return address;
	}

	public String getmob_no() {
		return mob_no;
	}

	public abstract double calculateSalary();

	@Override
	public String toString() {
		return "Employee [Id=" + id + ",  name = " + name + ", address = " + address + ", Mobile number = " + mob_no
				+ ", Salary = " + calculateSalary() + "]";
	}

}
