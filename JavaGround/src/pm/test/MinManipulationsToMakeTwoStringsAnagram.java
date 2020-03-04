package pm.test;

import java.util.Arrays;

public class MinManipulationsToMakeTwoStringsAnagram {
    public static int minSteps(String s, String t) {
    	int count = 0;
    	int countChars[] = new int[26];
    	for(int i = 0; i < s.length(); i++) {
    		countChars[s.charAt(i) - 'a']++;
    	}
    	
//    	System.out.println(Arrays.toString(countChars));
    	for(int i = 0; i < t.length(); i++) {
//    		System.out.println(t.charAt(i));
    		if(countChars[t.charAt(i) - 'a']-- <= 0)
    		{
    			System.out.println(t.charAt(i));
    			count++;

    		}
    	}
    	return count;
    }
	
	
	
	
	
	 public static void main(String[] args) 
	    { 
	  
	        String s1 = "friend"; 
	        String s2 = "family"; 
	        System.out.println(minSteps(s1, s2)); 
	    } 
}
