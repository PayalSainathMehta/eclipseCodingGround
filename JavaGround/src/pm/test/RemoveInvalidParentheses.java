package pm.test;

import java.util.ArrayList;
import java.util.List;

public class RemoveInvalidParentheses {
	 public List<String> removeInvalidParentheses(String s) {
		 List<String> output = new ArrayList<>();
		 removeInvalid(s,output,0,0,new char[] {'(',')'});
		 return output;
	    }
	 
	 public void removeInvalid(String s, List<String> output, int last_i, int last_j, char[] par) {
		 //FIRSTLY WE CHECK FOR COUNT OF '(' AND ')'
		 int count = 0;
		 for(int i = last_i; i < s.length(); i++) {
			 if(s.charAt(i) == par[0]) count++;
			 if(s.charAt(i) == par[1]) count--;
			 //IF COUNT IS POSITIVE, THAT MEANS NUMBER OF OPENING BRACKETS IS MORE. WE JUST CONTINUE.
			 // IF COUNT 0, THE NUMBER IS SAME.
			 if(count >= 0) continue;
			 //NOW WHEN THE COUNT BECOMES NEGATIVE, THAT IS THERE IS ATLEAST ONE EXTRA CLOSING BRACKET.
			 for(int j = last_j; j <= i; j++)
			 //WE TRAVERSE FROM LAST POSITION OF j UPTO i AND CHECK FOR IF THE CURRENT ELEMENT IS A CLOSING BRACKET 
			 //AND IF THE PREVIOUS ONE WAS NOT OR THIS IS THE FIRST ELEMENT OF THE STRING	 
				 if(s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
			 //THEN WE SIMPLY REMOVE THE jth ELEMENT FROM THE STRING TO BE CONSIDERED.
					 removeInvalid(s.substring(0,j) + s.substring(j+1,s.length()), output, i, j, par);
			 //return;
		 }
		 
		 //WHEN WE REACH HERE, WE'LL EFFECTIVELY BE DONE TRAVERSING THE STRING ONCE. 
		 //SO WE NOW JUST FEED THE REVERSE OF THE STRING BACK TO OUR FUNCTION TO CHECK FOR EXTRA INVALID OPENING BRACKETS
		 String reversed = new StringBuilder(s).reverse().toString();
		 if(par[0] == '(') 
			 removeInvalid(reversed, output, 0, 0, new char[] {')','('});
		 else
			 output.add(reversed);
		 
	 }
	public static void main(String args[]) {
		String s = "(a)())()";
		RemoveInvalidParentheses obj = new RemoveInvalidParentheses();
		List<String> result = obj.removeInvalidParentheses(s);
		System.out.println(result.toString());
	}

}
