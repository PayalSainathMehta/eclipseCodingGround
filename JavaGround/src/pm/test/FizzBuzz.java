package pm.test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	 public static List<String> fizzBuzz(int n) {
		 List<String> list = new ArrayList<>();
		 String val="";
		 for(int i = 1; i <= n; i++) {
			 if (i%15 == 0) val = "FizzBuzz";
			 else if(i%5 == 0) val = "Buzz";
			 else if(i%3 == 0) val = "Fizz";
			 else val = Integer.toString(i);
			 list.add(val);
		 }
		  
		 return list;
	        
	    }
	 public static void main(String[] args) {
		 List list = fizzBuzz(15);
		 System.out.println(list.toString());
	 }
	 

}
