/* Roots of Quadratic Equation */
package gu.ac.it;
import java.io.*;
import java.util.*;
public class ExampleOfQuadratic {
	public static void main(String args[]) {
		double a,b,c,r1,r2,dis;
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter value of a: ");
		a= sc.nextDouble();
		System.out.println("\nEnter value of b: ");
		b= sc.nextDouble();
		System.out.println("\nEnter value of c: ");
		c= sc.nextDouble();
		dis= b*b-4*a*c;
		if(dis<0)
			System.out.println("\n Roots are imaginary");
		else if (dis==0)
		{
			System.out.println("\n Roots are equal");
			r1= -b/(2*a);
			r2= -b/(2*a);
			System.out.println("\nRoot1 is: "+r1);
			System.out.println("\nRoot2 is: "+r2);
		}
		else
		{
			System.out.println("\n Roots are unequal");
			r1= -b+Math.sqrt(dis)/(2*a);
			r2= -b-Math.sqrt(dis)/(2*a);
			System.out.println("\nRoot1 is: "+r1);
			System.out.println("\nRoot2 is: "+r2);
		}
	}
}
