import java.util.Scanner;

public class User extends Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin");
		int pin = sc.nextInt();
		
		User obj = new User();
		obj.setMyPin(pin);
		boolean valid = obj.validate();
		if (valid) {
			System.out.println("Valid Pin : "+obj.getMyPin());
		} else {
			System.out.println("Invalid Pin!");
		}
	}

}
