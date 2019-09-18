package DBDA021;
 class Top1
{
	void disp()
 {
	 System.out.println("");
 }
}
 
 class Bottom1 extends Top1
 {
	 void disp()
	 {
		 System.out.println("abc");
	 }
 }
 class Bottom2 extends Top1
 {
	 void disp()
	 {
		 System.out.println("xyz");
	 }
 }
 class Bottom extends Top1
 {
	 void disp()
	 {
		 System.out.println("pqr");
	 }
 }
 public class Demo1
 {
	 public static void main(String args[])
	 {
		 Top1 t=new Bottom1();
		 t.disp();
				
	 }
 }