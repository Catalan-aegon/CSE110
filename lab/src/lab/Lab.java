package lab;
import java.util.Scanner;
public class Lab {

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
	  	System.out.println("the sum is: " + sum);
	  	
	  	double mult = fnum * snum;
	  	System.out.println("the product of multiplication is: " + mult);
	  	
	  	double div = fnum /snum;
	  	System.out.print("the division is: "+div);
		

	}
}