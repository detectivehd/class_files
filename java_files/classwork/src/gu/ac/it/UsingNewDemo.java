package gu.ac.it;

public class UsingNewDemo {
	public static void main(String[] args) {
		NewDemo d1 = new NewDemo(5);
		NewDemo d2 = new NewDemo("s");
		NewDemo d3 = new NewDemo();
		NewDemo d4 = new NewDemo(d1);
	}
}
