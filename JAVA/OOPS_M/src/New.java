import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
// Importing Set libraries
import java.util.Set;
import java.util.HashSet;

public class New {
    public static void main(String[] args) {
        int x = 121;
        int z = 121;
        if(x<0){
            System.out.println(false);
        }
        String str="";
        while(x!=0){
            int c = x%10;
            str+=c;
            x = x/10;
        }
        int foo;
        try {
             foo = Integer.valueOf(str);
        }catch (NumberFormatException e){
            foo = 0;
        }
        if(foo==z){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

//        System.out.println(foo);
//        System.out.println(x);
//
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        // Calling function to convert the array
//        Set<Integer> set = convert(nums);
//        ArrayList<Integer> list = new ArrayList<>(nums.length);
//        for (int elem:set){
//            list.add(elem);
//            if(elem){
//                list.add((int) '_');
//            }
//        }
//        for (int x:list){
//            System.out.print(x+" ");
//        }

//        Set<Integer> st = new HashSet<Integer>(Arrays.asList(nums));
    }
//    // Function to convert array to set
//    static Set<Integer> convert(int[] array){
//        // Hash Set Initialisation
//        Set<Integer> Set = new HashSet<>();
//        // Iteration using enhanced for loop
//        for (int element : array) {
//            Set.add(element);
//        }
//        // returning the set
//        return Set;
//    }
//    // Function to print the set
//    static void print(Set<Integer> Set){
//        // Implement to iterator the Set
//        Iterator<Integer> _iterator = Set.iterator();
//        // Iterate the elements of Set
//        while (_iterator.hasNext()) {
//            // print the element of the Set
//            System.out.print(_iterator.next() + " ");
//        }
//    }

