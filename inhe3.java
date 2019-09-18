package DBDA021;



class Machine
{
	Machine()
	{
		System.out.println("Machine starts");
	} 
	
}

class Camera extends Machine
{
	Camera()
	{
		System.out.println("CAmera on");
	}	
		
	

}

class Car extends Machine
{
     Car()
     {
    	 System.out.println("Car starts");
     }
    	 
    
     
}

 public class inhe3
{
	public static void main(String args[])
	{
		Car c =new Car();
		Camera c1=new Camera();
		
		
	}

}