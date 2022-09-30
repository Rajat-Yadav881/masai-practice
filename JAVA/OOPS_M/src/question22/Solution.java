package question22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,7,4,4);
        int key = 5;
        System.out.println(count(list,key));
    }
    public static int count(List<Integer> list,int key){
        int cnt = 0;
        Set<Integer> set = new HashSet<>(list);
        for (int i:set){
            if (i<key){
                cnt++;
            }
        }
        return cnt;
    }
}
