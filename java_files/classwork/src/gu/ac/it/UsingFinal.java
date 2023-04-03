package gu.ac.it;

public class UsingFinal {
	public static void main(String[] args) {
		final DemoOfFinal d= new DemoOfFinal("ABC");
		final DemoOfFinal d1 = new DemoOfFinal("XYZ");
//		d=d1;
		d.display();
		d1.display();
	}
}
