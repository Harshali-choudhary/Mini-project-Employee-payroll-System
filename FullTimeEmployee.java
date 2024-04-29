package employee_P;

public class FullTimeEmployee extends Employee {

	private double monthlySalary;

	public FullTimeEmployee(int id, String name, String address, String mob_no, double monthlySalary) {
		// TODO Auto-generated constructor stub
		super(id, name, address, mob_no);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

}
