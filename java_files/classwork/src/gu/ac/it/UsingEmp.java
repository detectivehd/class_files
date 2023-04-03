package gu.ac.it;

class UsingEmp {
	public static void main(String[] args) {
	Emp e1 = new Emp();
	e1.input("Hari",20000);
	Emp e2 = new Emp();
	e2.input("Juhi",25000);
	if(e1.getSal()>e2.getSal())
	{
		System.out.println("\n"+e1.getName()+"'s salary is higher");
	}
	else
	{
		System.out.println("\n"+e2.getName()+"'s salary is higher");
	}
	}
}
