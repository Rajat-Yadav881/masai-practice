import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> current = new ArrayList<>();
		current.add(3);
		current.add(5);
		current.add(7);
		current.add(9);
		current.add(6);
		current.add(9);
		current.add(6);
		
		List<List<Integer>> subsets = new ArrayList<>();
		
		subsets.add(new ArrayList<>(current));
		
		System.out.println(subsets);
	}
	
}
