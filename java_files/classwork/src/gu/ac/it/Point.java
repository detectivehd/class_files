package gu.ac.it;

public class Point {
	private int px;
	private int py;
	void input(int x,int y)
	{
		px = x;
		py = y;
	}
	void show()
	{
		System.out.println("("+px+","+py+")");
	}
}
