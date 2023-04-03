package gu.ac.it;

import java.util.Scanner;

public class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the real part of 1st number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the imaginary part of 1st number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the real part of 2nd number: ");
        double c = sc.nextDouble();
        System.out.println("Enter the imaginary part of 2nd number: ");
        double d = sc.nextDouble();
        Complex n1 = new Complex(a,b),
                n2 = new Complex(c,d),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
        temp = subtract(n1, n2);

        System.out.printf("\nDifference = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
    public static Complex subtract(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real - n2.real;
        temp.imag = n1.imag - n2.imag;

        return(temp);
    }
}
