package pm.test;

import java.io.IOException;
import java.util.Stack;



class Result {

    /*
     * Complete the 'compressWord' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING word
     *  2. INTEGER k
     */

	 static String remove_k_characters(String st1, int k) 
	    { 
	  
	        Stack<CharacterAttribs> st = new Stack<CharacterAttribs>(); 
	  
	        int i = 0; 
	        for (i = 0; i < st1.length(); i++) { 
	  	        char x = st1.charAt(i); 
	            if (st.size() > 0 && st.peek().frequency == k) { 
	                char curr = st.peek().character; 
	                while (st.size() > 0 && st.peek().character == curr) 
	                    st.pop(); 
	            } 
	  
	            if (st.size() > 0 && st.peek().character == x) { 
	            	CharacterAttribs new_top = new CharacterAttribs(x, st.peek().frequency + 1); 
	                st.push(new_top); 
	            } 
	            else { 
	            	CharacterAttribs new_top = new CharacterAttribs(x, 1); 
	                st.push(new_top); 
	            } 
	        } 
	        if (st.size() > 0 && st.peek().frequency == k) { 
	            char curr = st.peek().character; 
	            while (st.size() > 0 && st.peek().character == curr) 
	                st.pop(); 
	        } 
	        
	        StringBuilder sb = new StringBuilder();
	        while(st.size() > 0)
	        	sb.append(st.pop().character);
	        String result = sb.reverse().toString();
	        return result;
	    }
	  

}

class CharacterAttribs{
    char character;
    int frequency;

    CharacterAttribs(char c, int f){
        character = c;
        frequency = f;
    }
}

public class WordCompression {
    public static void main(String[] args) throws IOException {
       String s = "abbcccb";
       int k = 3;
       String result = Result.remove_k_characters(s,k);
       System.out.println(result);
    }
}
