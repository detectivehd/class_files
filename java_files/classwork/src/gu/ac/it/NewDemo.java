package gu.ac.it;

public class NewDemo {
	String str;
	int num;
	NewDemo(String s)
	{
		str = s;
		System.out.println("Constructor with string args");
	}
	NewDemo(int x)
	{
		num = x;
		System.out.println("Constructor with int args");
	}
	NewDemo(String str, int num)
	{
		this.str = str;
		this.num = num;
		System.out.println("Constructor with 2 args");
	}
	NewDemo()
	{
		this("Default",235);
	}
	NewDemo(NewDemo d)
	{
		this.str = d.str;
		this.num = d.num;
		System.out.println("Copy Constructor");
	}
}
