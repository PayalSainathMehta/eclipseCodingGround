package pm.test;

import java.util.Arrays;

public class AlienDictionary {
	private final int N = 26;
    public String alienOrder(String[] words) {
    	StringBuilder sb = new StringBuilder();
    	//visited array with 0 for characters in word of words
    	//visited[i] = -1 ----not exists
    	//visited[i] =  0 ----exists
    	//visited[i] =  1 ----visiting
    	//visited[i] =  2 ----visited
    	int[] visited = new int[N];
    	//adjacency list for characters of consecutive words but not same letters. put true.
//    	default false.
    	boolean adj[][] = new boolean[N][N];
//    	System.out.println(Arrays.deepToString(adj));
//    	build a graph with adjacency matrix set to true for characters of consecutive words
    	// visited[i] set to 0 for characters of words.
    	buildGraph(words,visited,adj);
    	//calls dfs on 'a'
    	for(int i = 0; i < N; i++) {
    		//only if a exists in any of the word of words.
    		if(visited[i] == 0)
    			if(!dfs(sb,visited,adj,i))
    				return "";
    	}
    	return sb.toString();
     }
    
    
    public boolean dfs(StringBuilder sb, int[] visited, boolean[][] adj, int i) {
    		visited[i] = 1;
    		for(int j = 0; j < N; j++) {
    			if(adj[i][j]) {
    				if(visited[j] == 1) return false;
    				if(visited[j] == 0)
    					if(!dfs(sb, visited,adj,j))
    						return false;
    			}
    		}
    		visited[i] = 2;
    		sb.append((char)(i + 'a'));
    		return true;
    	}
    	   
    
    public void buildGraph(String[] words, int[] visited, boolean[][] adj) {
    	Arrays.fill(visited, -1); // default - not exists
       	for(int i = 0; i < words.length; i++) 
    	{
    		for(char c: words[i].toCharArray())
    			visited[c - 'a'] = 0; //since this character exists
    		if(i > 0) //if on second word. compare characters of first two words
    		{
    			String word1 = words[i];
        		String word2 = words[i - 1];
        		int minLength = Math.min(word1.length(), word2.length());
        		for(int j = 0; j < minLength; j++) 
        		{
        			//compare characters upto length of smaller word
        			if(word1.charAt(j) != word2.charAt(j)) 
        			{
        				adj[word1.charAt(j) - 'a'][word2.charAt(j) - 'a'] = true;
        				break;
        			}
    		
    			}
    		}
    	}
    }
    	
    
    
    
    public static void main(String args[]) { 
    	String[] words = {"wrt","wrf","er","ett","rftt"};
    	AlienDictionary obj = new AlienDictionary();
    	String result = obj.alienOrder(words);
    	System.out.println(result);
    }

}
