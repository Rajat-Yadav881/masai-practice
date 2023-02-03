package contest849;

import java.util.Scanner;

public class FollowingDirections {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			int n = s.nextInt();
			String su = s.next();
			directions(n,su);
		}
		
	}
	static void directions(int n,String s) {
		int x = 0;
		int y = 0;
		boolean flag = false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='U') {
				y++;
			}else if(s.charAt(i)=='L') {
				x--;
			}else if(s.charAt(i)=='R') {
				x++;
			}else if(s.charAt(i)=='D'){
				y--;
			}
			if(x==1 && y==1) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
