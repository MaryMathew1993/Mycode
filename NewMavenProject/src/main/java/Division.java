//Exception handling
public class Division {

public static void main(String args[]) {
	int a=10,b=0;
	int ar[]= {1,3,4};
	//System.out.println(arr[3]);
	try {
		System.out.println(ar[3]);
	int div=a/b;}
	//catch(ArithematicException e) {
		//System.out.println("Division by zero not possible"+e);
		//}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index out of bound not possible");
	}
	catch(Exception e) {
		System.out.println(e);
		}
	finally {
		System.out.println("finally");
	}
System.out.println("Hello");
}
}