package ay7aga.java;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
 Scanner cj = new Scanner(System.in);
 System.out.println("enter 3 numbers x, y and z :");	
 int x = cj.nextInt();
 int y = cj.nextInt();
 int z = cj.nextInt();
	if (x > y && x > z )
		System.out.println("x is the greatest number");
	if (y > x && y > z)
		System.out.println("y is the greatest number");
	if (z > x && z > y)
		System.out.println("z is the greatest number");
	
}
}
