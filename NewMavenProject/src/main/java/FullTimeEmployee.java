
public class FullTimeEmployee extends EmployeeSalary {
	public static final int hour = 8;

	public static void main(String[] args) {

		FullTimeEmployee obj = new FullTimeEmployee();
		obj.calculateSalary();
	}

	public void calculateSalary() {
		int salary = amount * hour;
		System.out.println("FullTimeEmployee salary is " + salary);
	}

}
