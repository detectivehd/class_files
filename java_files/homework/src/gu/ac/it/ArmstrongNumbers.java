package gu.ac.it;
import java.util.*;

public class ArmstrongNumbers {
	public static void main(String args[]) {
		int start, end, i, a, b, rem, n=0, result = 0;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the first no. ");
			start = sc.nextInt();
			System.out.println("Enter the 2nd no.: ");
			end = sc.nextInt();
		}
		System.out.println("The Armstrong Numbers are: ");
		for(i = start ; i < end ; i++)
		{
		a = i;
		b = i;

		while (a != 0)
		{
		a /= 10;
		++n;
		}

		while (b != 0)
		{
		rem = b % 10;
		result += Math.pow(rem, n);
		b /= 10;
		}

		if (result == i) {
			System.out.println(i);
		}

		n = 0;
		result = 0;

		}
  

	}

}

