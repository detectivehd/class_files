package gu.ac.it;

public class Game {
	String pname;
	int points;
	Game(String pname, int points)
	{
		this.pname = pname;
		this.points = points;
	}
	void show()
	{
		System.out.println("\nName= "+this.pname);
		System.out.println("\nPoints= "+this.points);
	}
	Game check(Game g)
	{
		if(this.points>g.points)
			return this;
		else
			return g;
	}
}
