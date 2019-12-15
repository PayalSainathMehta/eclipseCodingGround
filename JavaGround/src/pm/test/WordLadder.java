package pm.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int step = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                String cur = q.poll();
                for (int i = 0; i < cur.length(); i++) {
                    for (char letter = 'a'; letter <= 'z'; letter++) {
                        StringBuilder newWord = new StringBuilder(cur);
                        newWord.setCharAt(i, letter);
                        if (set.contains(newWord.toString())) {
                            if (newWord.toString().equals(endWord)) 
                            	return step + 1;
                            set.remove(newWord.toString());
                            q.offer(newWord.toString());
                        }
                    }
                }
                
            }
            step++;
        }
        return 0;
    
    
	}
	
	   
	   
	   public static void main(String[] args) {
		  List<String> wordList = new ArrayList<>();
		  wordList.add("hot");
		  wordList.add("dot");
		  wordList.add("dog");
		  wordList.add("lot");
		  wordList.add("log");
		  wordList.add("cog");
		  //System.out.println(wordList.toString());
		  String beginWord = "hit";
		  String endWord = "cog";
		  System.out.println(ladderLength(beginWord, endWord, wordList));
	   }
}
