package pm.test;

import java.util.ArrayList;
import java.util.List;

public class ParitionLabels {
	  public static List<Integer> partitionLabels(String S) {
	        List<Integer> result = new ArrayList<>();
	        int map[] = new int[26];
	        //first pass = > maintain last seen index of a character
	        for(int i = 0; i < S.length(); i++)
	        	map[S.charAt(i) - 'a'] = i;
	        int last = 0;
	        int start = 0;
	        //second pass - see when everything works out.
	       /*
	        * Imagine a bus moving forward, 
	        * and imagine each char as a person yelling "I need to go that far!". 
	        * If a newcomer yelled a further position, we extend our expected ending position to that position.
	        * Eventually, if we reached a position that satisfied everybody in the bus at the moment, 
	        * we partition and clear the bus.
	        */
	        for(int i = 0; i < S.length(); i++)
	        {
	        	last = Math.max(last, map[S.charAt(i) - 'a']);
//	        	System.out.println(i + "," + last);
	        	if(last == i)
	        	{	
//	        		System.out.println(last);
	        		result.add(last - start + 1);
	        		start = last + 1;
	        
	        	}
	        }	
	        return result;
	    }
	  
	  
	  public static void main(String[] args) {
		 String s = "ababcbacadefegdehijhklij";
		 List<Integer> result = partitionLabels(s);
		 System.out.println(result.toString());
	}
}
