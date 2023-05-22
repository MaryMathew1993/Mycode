import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(12);
		System.out.println(hs.contains(13));
		System.out.println(hs);
	}

}
//Duplicate element get deleted automatically