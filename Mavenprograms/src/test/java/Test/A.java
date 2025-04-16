package Test;

public class A {
	static public int a=10;
	static private int b=8;
	static protected int c=6;
	static int d=9;
	public void add()
	{
	System.out.println("public");
	}
	private void sub()
	{
	System.out.println("private");
	}
	protected void div()
	{
	System.out.println("protected");
	}
	 void def()
	{
	System.out.println("default");
	}
	 public static void main(String args[])
	 {
	A ob =new A();
	ob.add();
	ob.sub();
	ob.div();
	ob.def();
	 
	 System.out.println(a);
	
	 }
}
