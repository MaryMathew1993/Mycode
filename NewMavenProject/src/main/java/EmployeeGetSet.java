//Encapsulation
public class EmployeeGetSet {
private int id;
private String name;
public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	public static void main(String[] args) {
		EmployeeGetSet obj=new EmployeeGetSet();
		obj.setId(10);
		obj.setName("Mary");
		System.out.println(obj.getId());
		System.out.println(obj.getName());

	}
	

}
