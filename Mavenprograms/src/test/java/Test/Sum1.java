package Test;

public class Sum1 {
	int add(int a,int b)
	{
		int sum= a+b;
		return sum;
	}
	float add(float a,float b)
	{
		float sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		Sum1 ob=new Sum1();
		System.out.println(ob.add(5,8));
		System.out.println(ob.add(5.2f,3.2f));
		// TODO Auto-;generated method stub

	}

}
