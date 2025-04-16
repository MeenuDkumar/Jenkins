package Test;

public class  Child extends Parent {
	void print()
	{
		System .out.println("Yes Right");
	}
	void display()
	{
		super.print();
		print();
	}
public static void main(String[] args)
{
Child ob=new Child();
ob.display();
}
}
