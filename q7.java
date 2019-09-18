package DBDA021;
class Parent1
{
	void disp()
	{
		System.out.println("hemant pagal hai");
	}
}
interface Parent2
{
	void disp1();
}
class Child extends Parent1 implements Parent2
{
	public void disp()
	{
		
	}

	public void disp1()
	{
		System.out.println("anjali acchi hai");
	}
}
public class q7 {

	public static void main(String[] args)
	{
		Child c=new Child();
		c.disp();
		c.disp1();
				
		// TODO Auto-generated method stub

	}

}
