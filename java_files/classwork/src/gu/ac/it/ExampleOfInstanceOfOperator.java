/* Example of Instance of a class */
package gu.ac.it;
import java.io.*;
import java.util.*;
public class ExampleOfInstanceOfOperator {
	public static void main(String args[]) {
		Object top;
		Float objf = 0.0f;
		Integer obji= 15;
		Long objl = 25l;
		top = objf;
		if (top instanceof Float)
			System.out.println("\n of class float");
		top = obji;
		if (top instanceof Integer)
			System.out.println("\n of class integer");
		top = objl;
		if (top instanceof Long)
			System.out.println("\n of class Long");
		top = new Dummy();
		if (top instanceof Dummy)
			System.out.println("\n of dummy class");
					
	}

}
