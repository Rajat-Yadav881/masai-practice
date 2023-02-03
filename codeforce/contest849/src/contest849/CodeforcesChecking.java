package contest849;


import java.util.Scanner;
public class CodeforcesChecking {
  
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        while (n-- > 0) {
            String c = s.next();
            String str="codeforces";
            if(str.contains(c)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
       
    }

}
