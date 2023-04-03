package gu.ac.it;
import java.io.*;

public class UsingInput {
	public static void main(String args[]) {
		String x,y;
		int a,b,c;
		try {
		DataInputStream input;
		input = new DataInputStream(System.in);
		System.out.println("Enter the first no. ");
		x = input.readLine();
		a = Integer.parseInt(x);
		System.out.println("Enter the 2nd no.: ");
		y = input.readLine();
		b = Integer.parseInt(y);
		c= a+b;
		System.out.println("Sum is "+ c);	
		}
		catch(Exception exp)
		{
			System.out.println("Error");
		}
	}
}
