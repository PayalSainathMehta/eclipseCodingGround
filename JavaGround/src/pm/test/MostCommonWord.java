package pm.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
	
	 public static String mostCommonWord(String paragraph, String[] banned) {
//	        String result = "";
//	        Map<String, Integer> counts = new HashMap<>();
//	        paragraph = paragraph.replaceAll("[.,!]", "");
//	        paragraph = paragraph.toLowerCase();
//	        //System.out.println(paragraph);
//	        paragraph = paragraph.strip();
//	        String words[] = paragraph.split("[, ] ?");
////	        System.out.println(Arrays.toString(words));
//	        for(String word: words) 
//	        	counts.put(word, counts.getOrDefault(word,0) + 1);
//	        //System.out.println(counts);
//	        PriorityQueue<String> pq = new PriorityQueue<>( (n1,n2) -> counts.get(n2) - counts.get(n1));
//	        for(String word: counts.keySet())
//	        	pq.offer(word);
//	        //System.out.println(pq.toString());
//	        outer: while(!pq.isEmpty()) {
//	        	result = pq.poll();
//	        	//System.out.println(result);
//	            for(String bannedWord: banned)
//	        		if(bannedWord.equalsIgnoreCase(result))
//	        			continue outer;
//		        return result;
//
//	        }
//	        return result;
	     Map<String, Integer> counts = new HashMap<>();
	     Set<String> ban = new HashSet<>(Arrays.asList(banned));
		 String words[] = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
		 for(String word: words)
			 if(!ban.contains(word))
				 counts.put(word,counts.getOrDefault(word,0) + 1);
		 return Collections.max(counts.entrySet(),Map.Entry.comparingByValue()).getKey();
			 
	    }
	 
	public static void main(String[] args) {
		String paragraph = "Payal, is!, a??, good ?? girl, is she?I think,so, she";
		String[] banned = {"hit"};
		String result = mostCommonWord(paragraph, banned);
		System.out.println(result);
	}
}
