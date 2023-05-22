import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mary");
		list.add("Abin");
		list.add("Jibi");
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Mathew");
		list1.add("Aleena");
		list1.add("Jijin");
		list.addAll(list1);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(3));
		for(String name:list) {
			System.out.println(name);
		}
	}

}
