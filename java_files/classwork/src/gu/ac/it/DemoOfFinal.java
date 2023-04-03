package gu.ac.it;

public class DemoOfFinal {
	String str;
	final int num = 20;
	static final float PI= 3.14f;
	DemoOfFinal(String s)
	{
		str = s;
	}
	void display()
	{
		System.out.println("String: "+str);
		System.out.println("Number: "+num);
		System.out.println("PI: "+PI);
	}
}
