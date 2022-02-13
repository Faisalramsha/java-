package package_faisal;

public class Reverse {
	    public static void main(String[] args) {  
	        int [] arr = new int [] {1, 2, 3, 4, 5};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + "        ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        for (int i = 4; i >= 0; i--) {  
	            System.out.print(arr[i] + "       ");  
	        }  
	    }  
	}  

