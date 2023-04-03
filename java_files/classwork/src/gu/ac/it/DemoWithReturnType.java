package gu.ac.it;
import java.io.*;
import java.util.*;

public class DemoWithReturnType {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double num,s;
		int num1;
		float num2;
		System.out.println("Enter a number: ");
		num = sc.nextDouble();
		s = sqr(num);
		System.out.println("\nSquare of " + num +" is "+s);
		System.out.println("Enter a integer number: ");
		num1 = sc.nextInt();
		s = OverloadingOfSquare.sqr(num1);
		System.out.println("\nSquare of " + num1 +" is "+s);
		System.out.println("Enter a float number: ");
		num2 = sc.nextFloat();
		s = OverloadingOfSquare.sqr(num2);
		System.out.println("\nSquare of " + num2 +" is "+s);
	}
	static double sqr(double x)
	{
		double t;
		t= x*x;
		return t;
		
	}
	
}
