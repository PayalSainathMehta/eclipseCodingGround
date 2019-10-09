package pm.test;

import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minstack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        if(minstack.isEmpty() || x <= getMin())
        	minstack.push(x);
        
    }
    
    public void pop() {
    	if(stack.isEmpty()) return;
        int x = stack.pop();
        if(x == minstack.peek()) minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }


    public static void main(String[] args) {
 //Your MinStack object will be instantiated and called as such:
    	MinStack obj = new MinStack();
    	obj.push(-2);
    	obj.push(0);
    	obj.push(-3);
    	int minimum1 = obj.getMin();  
    	obj.pop();
    	int topEle = obj.top();     
    	int minimum2 = obj.getMin();  
    	System.out.println("Minimum element is: "+minimum1);
    	System.out.println("Top element is: "+topEle);
    	System.out.println("Minimum element is: "+minimum2);

  } 
}