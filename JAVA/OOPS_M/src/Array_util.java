import java.util.Arrays;
import java.util.List;

public class Array_util {
    public static void main(String[] args) {
        int[] arr = new int[]{63,34,4,62,1,7};
        int[] arr1 = new int[]{45,4,6,3,7,2};
        sort(arr);
        System.out.println(equals(arr,arr1));
    }
    public static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static boolean equals(int[] arr,int[] arr1){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==arr1[i]){
                count++;
            }
        }
        if (count== arr.length){
            return true;
        }
        return false;
    }
}
