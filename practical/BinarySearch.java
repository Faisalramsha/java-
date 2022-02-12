package package_faisal;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	int	arr[] = {10,30,40,50,60};
		int a=80;
		int result = Arrays.binarySearch(arr,a);
      if(result<0) 
    	  System.out.println("Not found");			
      
      else 
  System.out.println("The desired element found at index value ----->>>>>> "+result);

	}

}
