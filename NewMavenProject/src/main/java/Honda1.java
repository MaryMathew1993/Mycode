
public class Honda1 implements Bike1,Car{

	public static void main(String[] args) {
	Bike1 obj=new Honda1();
		obj.run();
		obj.display();
		

	}
	public void run() {
	System.out.println("Bike speed is 40Km/hr");}
public void display() {
	System.out.println("Bike running");
}
}
