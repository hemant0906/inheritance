package DBDA021;

abstract class Shape1
{
	abstract void draw();
	


}
 class Triangle extends Shape1
{
	void draw()
	{
		System.out.println("traingle");
	}
}
class Polygon extends Shape1
{
	void draw()
	{
		System.out.println("multiple shape");
	}
}
class Circle extends Shape1
{
	void draw()
	{
		System.out.println("circle");
	}
}
public class Shape
{
	public static void main(String args[])
	{
		Shape1 arr[]=new Shape1[3];
		
			arr[0]=new Triangle();
			arr[1]=new Polygon();
			arr[2]=new Circle();

			for(int i=0;i<arr.length;i++)
			{
				arr[i].draw();
			}
		
				
	}
}
