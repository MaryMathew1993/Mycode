import java.util.Scanner;

public class Contractor extends EmployeeSalary {
	static int hour;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the working hours");
		hour = sc.nextInt();
		Contractor obj = new Contractor();
		obj.calculateSalary();
	}

	public void calculateSalary() {
		int salary = amount * hour;
		System.out.println("Contractor salary is " + salary);
	}

}
