//throw Exception Program
public class TestThrow {

	public static void main(String[] args) {
	int age=19;
	if(age<18)
	throw new ArithmeticException("Not eligible for voting");
	else
		System.out.println("Eligible for voting");
	System.out.println("Rest of the code");
	}

}

//age<18 it will throw exception and further code will not get executed
//age>18  else code will executed
//Eligible for voting
//Rest of the code