package gu.ac.it;

public class UsingPoint {
	public static void main(String[] args)
	{
		Point arr[] = new Point[5];
		int i;
		System.out.println("Points are: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=new Point();
			arr[i].input(234 + i *2, 254 + i * 3);
			arr[i].show();
		}
	}
}
