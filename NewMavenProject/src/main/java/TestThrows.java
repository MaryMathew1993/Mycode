
public class TestThrows {

	public static void main(String[] args) {
		try {
			System.out.println(TestThrows.divideNum(5,0));
		}
		catch(ArithmeticException e){
			System.out.println("Number divide by zero");
		}
		System.out.println("Rest of the code");

	}
public static int divideNum(int a,int b)throws ArithmeticException
{
	int div=a/b;
	return div;
}
}
