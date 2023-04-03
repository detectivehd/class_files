/* Greatest of 3 numbers using ternary operator*/
package gu.ac.it;
import java.util.*;

public class UsingTernaryOperator {
	public static void main(String args[]) {
		int a,b,c,max1,max;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the first no. ");
			a = sc.nextInt();
			System.out.println("Enter the 2nd no.: ");
			b = sc.nextInt();
			System.out.println("Enter the 3rd no.: ");
			c = sc.nextInt();
		}
		max1 = a>b?a:b;
		max = max1>c?max1:c;
		System.out.println("Maximum = " +max);
	}
}
