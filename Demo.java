package core1;

/*class MyArithException extends Exception
{
	

	MyArithException(String abc)
	{
		super(abc);
	}
}
class calc
{
	int i ;
	void perform(int i) throws MyArithException
	{
	
		if(i<0)
		{
			throw new MyArithException("negative not allowed");
		}	
		else if(i==0){
			throw new MyArithException("zero not allowed");
		}
		else
		{   
			
			System.out.println("i"+"="+i*2);
		}
	}
}

public class Demo
{
	public static void main(String args[]) 
		{
		
	
			calc c=new calc();
			try
			{
			
				c.perform(-7);
			}
			catch(MyArithException ee)
			{
				ee.printStackTrace();
			}
		}
}
*/
class MyArithException extends Exception
{

		MyArithException(String abc)
		{
			super(abc);
		}
	}
class Calc
{
	int i;
	void perform(int i) throws MyArithException
	{
	if (i<0)
	{
		throw new MyArithException("zero not allowed");
	}
	else if (i==0)
	{
		throw new MyArithException("negative not allowed");
	}
}
}
public class Demo
{
	public void main(String args[])
	{
		Calc c=new Calc();
		try{
			c.perform(8);
			
		}
		catch(MyArithException ee)
		{
			ee.printStackTrace();
		}
	}
}
