package pm.test;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
    	HashMap<Character, Character>mapping = new HashMap<>();
    	mapping.put(']', '[');
    	mapping.put('}', '{');
    	mapping.put(')', '(');
    	
    	Stack<Character>stack = new Stack<>();
    	char ch,top;
    	for(int i = 0; i < s.length(); i++) {
    		 ch = s.charAt(i);
    		if(mapping.containsKey(ch)) {
    			top = stack.pop();
    			if(top != mapping.get(ch))
    				return false;
       		}
    		else {
    			stack.push(ch);
    		}
    	}
    	
    	return stack.isEmpty();
    }
    
    public static void main(String args[]) {
    	ValidParenthesis obj = new ValidParenthesis();
    	boolean res = obj.isValid("((({}[])))");
    	System.out.println(res);
    }

}
