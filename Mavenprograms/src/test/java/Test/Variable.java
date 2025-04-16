package Test;

public class Variable {
	int a=2;
	static int b=3;
	Variable()
	{
		System.out.println("Constructor");
	}
	Variable(int a,int b)
	{  
		this();
		int c= a+b;
		System.out.println(c);
	}
	
	public static void method()
	{
	
		System.out.println("Static method");
	}
	public int print() {
		int age=5;
		System.out.println(age);
		return age;
		
	}

	public static void main(String[] args) {
		
		Variable ob=new Variable(5,10);
	    Variable.method();
	
		ob.print();
		System.out.println(ob.a);
				
		System.out.println(b);
		
		// TODO Auto-generated method stub

	}

}
