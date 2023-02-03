package contest849;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			ArrayList<String> arr = new ArrayList<>();
			for(int i=0;i<n;i++) {
				String d = s.substring(0,i);
				arr.add(d);
			}
			 for (String a : arr)
		            System.out.println(a);
			
//		}
		
		
	}

}
