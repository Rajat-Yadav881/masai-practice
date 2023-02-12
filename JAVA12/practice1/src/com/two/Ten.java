package com.two;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ten {
	public static void main(String[] args) {
		Integer[] arr =new Integer[]{55,48,48,45,91,97,45,1,3,54,36,6,19,35,66,36,72,93,38,21,65,70,36,63,39,76,82,26,67,29,24,82,62,53,1,50,47,65,67,19,66,90,77};
		
		List<Integer> lst = Arrays.asList(arr);
//		lst.add(1);
//		lst.add(2);
//		lst.add(3);
//		lst.add(-1);
//		lst.add(-2);
//		lst.add(-3);
//		lst.add(0);
//		lst.add(0);
		plusMinus(lst);
	
	}
	public static void plusMinus(List<Integer> arr) {
	    
	        Map<Integer,Integer>map = new HashMap<>();
	        for(int i=0;i<arr.size();i++){
	            if(map.containsKey(arr.get(i))){
	                int count = map.get(arr.get(i))+1;
	                map.put(arr.get(i),count);
	            }else{
	                map.put(arr.get(i),1);
	            }
	        }
	        double x = 0;
	        double y=0;
	        double z=0;
	        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
	            if(mp.getKey()<0){
	                x = x+mp.getValue();
	            }else if(mp.getKey()==0){
	                y = y+mp.getValue();
	            }else {
	            	z = z+mp.getValue();
	            }
	        }
	      
	        
	        System.out.println(x+" "+y+" "+z);
	        double v = (double)x/arr.size();
	        double w = (double)y/arr.size();
	        double u = (double)z/arr.size();
	        System.out.printf("%.6f", u);
	        System.out.println();
	        System.out.printf("%.6f", v);
	        System.out.println();
	        System.out.printf("%.6f", w);
	    }
}
