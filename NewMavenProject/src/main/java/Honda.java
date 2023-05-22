
public class Honda extends Bike{
	
	public static void main(String[] args) {
		Bike obj = new Honda(); 
		//Bike obj1=new Bike();   Cannot be instantiated so object creation is not possible in non abstract class
		 obj.run();
		 obj.display();

	}
	void run(){
		System.out.println("Running 60Km/hr");
		} 
}
