package employee_P;

import java.util.ArrayList;

public class PayrollSystem {

	private ArrayList<Employee> employeelist;

	public PayrollSystem() {
		// TODO Auto-generated constructor stub
		employeelist = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employeelist.add(employee);

	}

	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for (Employee employee : employeelist) {
			if (employee.getid() == id)

			{
				employeeToRemove = employee;
				break;
			}
		}

		if (employeeToRemove != null) {
			employeelist.remove(employeeToRemove);
		}
	}

	public void displayEmployee() {
		for (Employee employee : employeelist) {
			System.out.println(employee);
		}
	}
}
