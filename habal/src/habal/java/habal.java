package habal.java;

import java.util.Scanner;

public class habal {
public static void main(String[] args) {
		
		double fnum;
		double snum;
		
		Scanner ay = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		fnum = ay.nextDouble();
		//fnum += 2;
		System.out.println("enter 2nd number:");
		snum = ay.nextDouble();
		
		double sum = fnum + snum;
		double mult = fnum * snum;
		double div = fnum /snum;
	    
		System.out.println("what do you want? sum, mult or div?");
	    String x1 = ay.next();
	    
	    if (x1.equals("sum"))
	    System.out.println("the sum is: " + sum);
	    
	    if (x1.equals("mult"))
	    System.out.println("the product of multiplication is: " + mult);
	    
	    if (x1.equals("div"))
	    System.out.println("the division is: "+div);
	  	
	  	

}
}