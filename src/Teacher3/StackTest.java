package Teacher3;

import java.util.ArrayList;
import java.util.PriorityQueue;

class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("arrayStack");
			return null;
		}
		return arrayStack.remove(len-1);
	}
	
//Queue
	//Stack
}


public class StackTest{
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}