/*
 * REFER TO PYTHON SOLUTION
 */


//package pm.test;
//
//import java.util.Stack;
//
//public class DecodeString {
//    public String decodeString(String s) {
//        int curNum = 0;
//        String curString = "";
//        char c;
//        Stack<String> stack = new Stack<>();
//        for(int i = 0; i < s.length(); i++) {
//        	c = s.charAt(i);
//        	if(Character.isDigit(c))
//        		curNum = curNum * 10 + (int)c;
//        	else if(c == '[') {
//        		stack.push(curString);
//        		stack.push(curNum);
//        		
//        	}
//        	else if(c == ']') {
//        		
//        	}
//        	else
//        		curString = curString + c;
//        }
//       
//        return curString;
//
//	}
//}
