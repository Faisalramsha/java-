package package_faisal;
import java.util.*;
public class testjavaCollection9{ 

	public class TestJavaCollection9{  
	public static void main(String args[]){  
	//Creating and adding elements  
	TreeSet<String> set=new TreeSet<String>();  
	set.add("Ravi");  
	set.add("Vijay");  
	set.add("Ravi");  
	set.add("Ajay");  
	//traversing elements  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	

