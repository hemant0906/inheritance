package DBDA021;

class base1{
	int a;
	base1(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	
}
class sub1 extends base1{
	int b,c,d;
	sub1()
	{
		super(10);
		System.out.println("sub class default");
	}
	sub1(int b)
	{
		super(20);
		this.b=b;
		System.out.println(b);
	}
	sub1(int c,int d)
	{ 
		super(30);
		this.c=this.d;
		System.out.println(b);
	}
		
	}


public class q8 {
	public static void main(String[] args)
	{
		sub1 s=new sub1();
		
		
		
	}

}
