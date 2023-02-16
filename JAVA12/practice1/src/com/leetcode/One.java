package com.leetcode;

public class One {
	public static void main(String[] args) {
		String s = "football";
		char letter = 'o';
		int x = percentageLetter(s,letter);
		System.out.println(x);
	}
	public static int percentageLetter(String s, char letter) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
  
        double per = (double)count/n;
        int per1 = (int) (per*100);
       
        return per1;
    }
}
