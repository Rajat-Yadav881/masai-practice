import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//import java.util.stream.Collectors;

class Main4 {
	public static void main(String[] args) {
		int[] array = new int[]{-1,0,1,2,-1,-4};
		
		Main4 m = new Main4();
		m.threeSum(array);
	}
    
    public void threeSum(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (Integer t : array) {
            set.add(t);
        }
        System.out.println(set);
    }

}