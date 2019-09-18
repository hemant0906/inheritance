package DBDA021;


interface A 
{ 
	void disp1();
	
}
interface B extends A
{
	void disp2() ;
	
	
}
class C implements B
{
	public void disp1()
	
		{
			System.out.println("anjali");
		}

	
	public void disp2()
		{
			System.out.println("hemant");
		}
		
	

}
public class Q6
{
	public static void main(String args[])
	{
		C ref1=new C();
		ref1.disp1();
		ref1.disp2();
	}
}

