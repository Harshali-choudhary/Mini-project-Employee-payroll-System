package employee_P;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PayrollSystem payrollSystem = new PayrollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee(1, "Vikas", "Pune", "987654321", 55000);
		FullTimeEmployee emp2 = new FullTimeEmployee(3, "Anurag", "Indore", "987654123", 75000);
		PartTimeEmployee emp3 = new PartTimeEmployee(2, "Alexander", "mumbai", "876549123", 8, 150);
		PartTimeEmployee emp4 = new PartTimeEmployee(4, "Anjali", "Bhopal", "786549123", 7, 250);

		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		payrollSystem.addEmployee(emp3);
		payrollSystem.addEmployee(emp4);
		System.out.println("Initial Employee Details : ");
		payrollSystem.displayEmployee();
		System.out.println("Removing Employee : ");
		payrollSystem.removeEmployee(2);
		System.out.println("Remaining Employee Details :");
		payrollSystem.displayEmployee();

	}

}
