package Test;

public class New {
	public int add(int  a, int b)
	{
		return a+b;
		
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
		
	}

	public static void main(String[] args) {
		New ob =new New();
		System.out.println(ob.add(5, 20));
		System.out.println(ob.add(5, 20,15));
		// TODO Auto-generated method stub

	}

}
