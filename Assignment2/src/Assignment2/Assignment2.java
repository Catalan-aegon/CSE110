//Name : Malek Mohamed Ramy Rohym Ibrahim
//ID : 223101638
//Assignment2 
//Date : 5th Nov. 2023

// Part 1 Answers:
//1.
//a)true
//b)false
//c)true
//d)true
//2.
//import java.util.Scanner;
//public static void main(String[] args) {
//Scanner cj = new Scanner(System.in);
//		System.out.println("Enter ur first name :");
//		String x = cj.next();
//		System.out.println("Enter ur last name :");
//		String y = cj.next();
//		System.out.println(x + " " + y);}
//3.
//Hy


package Assignment2;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		System.out.println("Welcome to the In-N-Out Menu:\n .............................");
        System.out.println("Hamburger: $2.75\n Cheeseburger: $3.25\nFrench Fries: $2.50\nShakes & Beverages: $1.50");
  Scanner cj = new Scanner(System.in);
        System.out.println("How many hamburger(s) would you like to buy?");
  int hmb = cj.nextInt(); 
        System.out.println("How many cheeseburger(s) would you like to buy?");
  int csb = cj.nextInt();	
	    System.out.println("How many French fries would you like to buy?");
	int ff = cj.nextInt();
	System.out.println("How many drink(s) would you like to buy?");
	int d = cj.nextInt();
double	Hamburger = 2.75;
double	Cheeseburger = 3.25;
double	Fries = 2.50;
double	Drink = 1.50;
 double total1 = Hamburger * hmb;
 double total2 = Cheeseburger * csb;
 double total3 = Fries * ff;
 double total4 = Drink * d;
 double sum = total1 + total2 + total3 + total4;
 int num = hmb + csb + ff + d;
  System.out.println("The total cost for the hamburger(s) is :" + total1 );
  System.out.println("The total cost for the cheeseburger(s) is :" + total2);
  System.out.println("The total cost for fries is :" + total3);
  System.out.println("The total cost for drink(s) :" + total4);
  if(total1 > total2 )
	  if(total1 > total3)
		  if(total1 > total4)
			  System.out.println("Hamburgers had the highest total cost.");
  if(total2 > total1)
	  if(total2 > total3)
		  if(total2 > total4)
			  System.out.println("Cheeseburgers had the highest total cost.");
  if(total3 > total1)
	  if(total3 > total2)
		  if(total3 > total4)
			  System.out.println("French fries had the highest total cost.");
  if(total4 > total1)
	  if(total4 > total2)
		  if(total4 > total3)
			  System.out.println("Drinks had the the highest total cost.");
  
  System.out.println("The total cost for the order is :" + sum);
  System.out.println("The total number of items ordered is :" + num);
	  
  
	  
	
	} 
}