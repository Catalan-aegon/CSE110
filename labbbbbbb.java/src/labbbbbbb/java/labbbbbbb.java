package labbbbbbb.java;
import java.util.*;
public class labbbbbbb {
	public static void main(String[] args) {
    Scanner cj = new Scanner(System.in);
    System.out.println("Enter the values enter 0 to calculate average:");

     int count = 0;	        
     double sum = 0;
	 double value;
	 do {
		           
		 value = cj.nextDouble();

		 
		 if (value != 0) {		 
			 sum += value;
			 count++;
		            }
		     
	 } while (value != 0);

	
	 if (count > 0) {
	
		 double average = sum / count;
		 System.out.println("The average is: " + average);
		 
	 } else {
		 System.out.println("No values entered. Cannot calculate average."); 
	 }
	 cj.close();
		    }
		
}