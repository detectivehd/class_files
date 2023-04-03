package gu.ac.it;
import java.util.*;

public class Calculator {
	public static void main(String args[])
	{
	    char operator;
	    float a,b,result;
	    try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter an operator(+,-,*,/): ");
			operator = sc.next().charAt(0);

			System.out.println("Enter the first no. ");
			a = sc.nextInt();
			System.out.println("Enter the 2nd no.: ");
			b = sc.nextInt();
		}
	    switch(operator)
	    {
	    case '+':
	        result = a + b;
	        System.out.println( a + " + " + b + " = " + result);
	        break;
	     case '-':
	        result = a - b;
	        System.out.println( a + " - " + b + " = " + result);
	        break;
	     case '*':
	        result = a * b;
	        System.out.println( a + " * " + b + " = " + result);
	        break;
	     case '/':
	        result = a / b;
	        System.out.println( a + " / " + b + " = " + result);
	        break;
	     default:
	    	 System.out.println("Error! Operator is not correct.");
	    }
	}
}
