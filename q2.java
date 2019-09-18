package DBDA021;

class Vehicle
{
	public void start() {
	}
	
}

class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("hii");
	}
	
}

public class q2 {

	public static void main(String args[])

	{
		Fourwheeler f=new Fourwheeler();
		f.start();
		}
}
