/* Addition using scanner class */
package gu.ac.it;
import java.util.*;

public class UsingUserInput {
	public static void main(String args[]) {
		int x,y,z;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the first no. ");
			x = sc.nextInt();
			System.out.println("Enter the 2nd no.: ");
			y= sc.nextInt();
		}
		z= x+y;
		System.out.println("Sum is "+ z);
	}
}
