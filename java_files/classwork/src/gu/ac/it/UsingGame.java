package gu.ac.it;

public class UsingGame {
	public static void main(String[] args)
	{
		Game g1= new Game("Hari",1560);
		Game g2= new Game("Tony",1760);
		g1.show();
		g2.show();
		Game g3;
		g3=g1.check(g2);
		g3.show();
	}
}
