package Test;

public class Variables {
	int a =5;
	static int b=20;
	static int g;
	public int add()
  {
		int d=5,i=3;
		
		int sum = d+i;
		return sum;
	}
	public static int sum()
	{
		 g =5+3;
		return g;
	}
	public int adds()
	{
		int e=20,f=3;
		int s=e+f;
		return s;
		
	}
	public static void main(String[] args) {
	Variables ob =new Variables();
	Variables obj =new Variables();
	System.out.println(ob.add());
	System.out.println(obj.adds());
	System.out.println("Static variable=" +b);
	System.out.println(ob.a);
	System.out.println( "Static method="+Variables.sum()); 
	
		// TODO Auto-generated method stub

	}

}
