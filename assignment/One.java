package package_faisal;
import java.util.Scanner;
public class One {
	

	
	
	    public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("How many numbers you want to input?");
	        int n = in.nextInt();
	        
	        int arr[] = new int[n];
	        System.out.println("Enter the numbers: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = in.nextInt();
	        }
	        
	        long sum = 0;
	        for (int i = 0; i < n; i++) {
	            System.out.println("arr[" + i + "] = " + arr[i]);
	            sum += arr[i];
	        }
	        System.out.println("Sum of all numbers = " + sum);
	    }
	}


