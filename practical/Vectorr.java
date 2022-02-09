package package_faisal;

import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Vectorr {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator itr=(Iterator) v.iterator();  
		while(itr.next()){  
		System.out.println();  
		}
		
		

	}

}
