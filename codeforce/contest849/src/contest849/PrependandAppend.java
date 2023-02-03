package contest849;

import java.util.Scanner;

public class PrependandAppend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			
			int start = 0;
			int last = n-1;
			boolean flag = false;
			int x = 0;
			while(start<=last) {
				if(s.charAt(start)==s.charAt(last)) {
					x = last-start+1;
					break;
				}
				start++;
				last--;
			}
			System.out.println(x);
		}
		
	}
	
}
