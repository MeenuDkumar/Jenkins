
public class Sum {
	int a,b,sum;
	Sum(int a,int b)
//public int add(int a,int b)
	{
		this.a=a;
		this.b=b;
		sum = a+b;
	}
	void display()
	{
		System.out.println(sum);
	}
		
	public static void main(String[] args) {
		Sum ob =new Sum(5,10);
		ob.display();
		//System.out.println(ob.add);
		//System.out.println(ob.add(5, 10));
		// TODO Auto-generated method stub

	}

}
