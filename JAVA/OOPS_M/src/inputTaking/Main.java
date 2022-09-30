package inputTaking;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
////        while(scn.hasNext()){
////            int n = scn.nextInt();
////            System.out.println(n);
////        }
//////        double n = scn.nextDouble();
//////        System.out.println(n);
////        int j = scn.nextInt();
////        for (int k=1;k<=j;k++){
////            int n = scn.nextInt();
////            int[] arr = new int[n];
////            for (int i=0;i<arr.length;i++){
////                arr[i] = scn.nextInt();
////            }
////            System.out.println(Arrays.toString(arr));
////            int x = scn.nextInt();
////        }
//
//        //taking input for 3D array
//        int t = scn.nextInt();
//        while (t--!=0){
//            int n = scn.nextInt();
//            int m = scn.nextInt();
//            int[][] arr = new int[n][m];
//            for (int i=0;i<n;i++){
//                for (int j=0;j<m;j++){
//                    arr[i][j] = scn.nextInt();
//                }
//            }
//        }
//
//
//    }
//    public static void printArray(int[][] arr,int n,int m){
//            for (int i=0;i<n;i++){
//                for (int j=0;j<m;j++){
//                    System.out.print(arr[i][j]+" ");
//                    System.out.println();
//                }
//                System.out.println("-------------------");
//            }
//    }
//}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String st = sc.nextLine();
            System.out.println(st);
        }

    }

}
