package package_faisal;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		int a,b,larger;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		a = scan.nextInt();
		
		System.out.println("Enter second number");
		b = scan.nextInt();
		
		if(a>b)
			larger=a;
		else
			larger=b;
		
	System.out.println("the largest number among two =" +larger);	

	}

}
