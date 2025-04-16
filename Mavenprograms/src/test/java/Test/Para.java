package Test;

public class Para {
	public int add(int a,int b)
	{
		return a+b;
	}
	public static int sum(int c,int d)
	{
		return c+d;
	}
	public static void main(String[] args) {
		
		Para ob =new Para();
		System.out.println(ob.add(5, 10));
		System.out.println(Para.sum(10, 15));
		
	}
	
	

}
