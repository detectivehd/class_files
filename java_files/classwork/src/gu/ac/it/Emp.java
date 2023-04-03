package gu.ac.it;

class Emp {
	private String name;
	private float sal;
	void input(String n, float a)
	{
		name = n;
		sal=a;
	}
	float getSal()
	{
		return sal;
	}
	String getName()
	{
		return name;
	}
}
