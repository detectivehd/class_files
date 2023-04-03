package gu.ac.it;

public class Mouse {
	String cname;
	String type;
	float price;
	
	Mouse(String cname,String type, float price){
		this.cname = cname;
		this.type = type;
		this.price = price;
		show();
	}
	void show()
	{
		System.out.println("\n Company: "+cname);
		System.out.println("\n Type of the mouse: "+type);
		System.out.println("\n Price of the mouse: "+price);		
	}
}
