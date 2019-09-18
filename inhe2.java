class Vehicle
{
	public void start()
	{
		System.out.println("Engine starts");
	}
}



class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("Fourwheeler Engine starts");
	}
}



public class inhe2 {

	public static void main(String args[])
	{
		Vehicle v=new Vehicle();
		v.start();
		Vehicle v1=new Fourwheeler();
		v1.start();
		
	}
}
