package employee_P;

public class PartTimeEmployee extends Employee {
	
	private int HoursWorked;
	private double hoursRate;

	public PartTimeEmployee(int id,String name,String address,String mob_no,int HoursWorked,double hoursRate) {
		// TODO Auto-generated constructor stub
		super(id,name,address,mob_no);
		this.HoursWorked = HoursWorked;
		this.hoursRate = hoursRate;
	}
	
    @Override
    public double calculateSalary()
    {
    	return HoursWorked * hoursRate;
    }
    
}
