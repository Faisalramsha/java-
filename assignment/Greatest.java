package package_faisal;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		int a,b,sum,product,avg;
		int c;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		a = scan.nextInt();
		
		System.out.println("Enter second number");
		b = scan.nextInt();
		System.out.println("Enter third number");
		c = scan.nextInt();
		
		sum=a+b+c   ;
	System.out.println("The sum of given numbers " +sum);
	product=a*b*c   ;
System.out.println("The product of given numbers " +product);

avg=product/3   ;
System.out.println("The averag of given numbers " +avg);
	 

	}

}
