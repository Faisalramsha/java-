package package_faisal;

public class students {

	    String name;
	    String course;
	    int age;
	  
	    public void Students(String name, String course,int age)
	    {
	        this.name = name;
	        this.course = course;
	        this.age = age;
	    }
	   
	   
	    public String getName()
	    {
	        return name;
	    }
	   
	  
	    public static void main(String[] args)
	    {
	        // creating object using new operator
	        Student s1 = new Student("Ravi","CSE",23);
	        
	        System.out.println(s1.getName());
	    }
	}


