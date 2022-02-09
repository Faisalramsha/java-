package package_faisal;

import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.*;

public class Stack {

	public static void main(String[] args) {
		Stack stack = new Stack();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator itr=stack.iterator();  
		while(itr.next()){  
		System.out.println();  
		}

	}

	private void pop() {
		// TODO Auto-generated method stub
		
	}

	private Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private void push(String string) {
		// TODO Auto-generated method stub
		
	}

}
