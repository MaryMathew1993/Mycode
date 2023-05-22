import java.util.Scanner;

public class Hdfc extends Rbi {

	public static void main(String[] args) {
		Hdfc obj = new Hdfc();
		obj.recurringDeposit();
	}

	void recurringDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		System.out.println("Enter the duration");
		int duration = sc.nextInt();
		float interest = (interestRate * amount * duration) / 100;
		float finalAmount = amount + interest;
		System.out.println("Amount after " + duration + " period of time is " + interest);
		System.out.println("Final amount is:" + finalAmount);
	}
}
