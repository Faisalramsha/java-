package package_faisal;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
int counter,num,item,array[],first,last,middle;
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the number of Elements : ");
		
		num= a.nextInt();
		
		array = new int[num];
		System.out.println("Enter "+ num + "integers");
		
		for (counter = 0; counter < num; counter++)
	          array[counter] = a.nextInt();

	      System.out.println("Enter the search value:");
	      item = a.nextInt();
	      first = 0;
	      last = num - 1;
	      middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( array[middle] < item )
	           first = middle + 1;
	         else if ( array[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
		
		

	}

	}


