package com.gfg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Four {
	public int firstElementKTime(int[] arr, int n, int k) { 
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < n; i++){
            int a = 0;
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>=k){
                return key;
            }
        }
        return -1;
    }
}
