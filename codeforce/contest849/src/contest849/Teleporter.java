package contest849;

import java.util.Arrays;
import java.util.Scanner;

public class Teleporter {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) { 
                array[i] = sc.nextInt();
                array[i] += i + 1;
            }
            Arrays.sort(array);
            int i;
            for (i = 0; i < n; i++) { 
                if (c >= array[i]) 
                    c -= array[i];
                else 
                    break;
                
            } 
            System.out.println(i);
        }
    }
}
