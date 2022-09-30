import java.util.*;
public class List_array {
    public static void main(String[] args) {
        //list is the  interface
//        List<String> list = Arrays.asList("one","two","three","four","five");
//        System.out.println(list);
        List<Integer> list = new ArrayList<>();//enternally size will be 10
            //load factor=75%
            //initial Capacity=10
        List<Integer> anotherList = Arrays.asList(0,1,2,3,4,5);
        list.addAll(anotherList);
        Object[] objArray = list.toArray();
        //iteration
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
