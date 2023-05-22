import java.util.ArrayList;
public class ArrayListColours {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		System.out.println(colors);
		// To search an element in array list
		System.out.println(colors.contains("Pink"));
		// remove third element in array list
		colors.remove(2);
		System.out.println("Array list after removing third element is " + colors);
		// iterate through all elements in a array list
		System.out.println("Colors in the collection:");
		for (String color : colors) {
			System.out.println(color);}
		// element (at a specified index)
		String color = colors.get(2);
		System.out.println("Element at specified index is " + color);
	}
}
