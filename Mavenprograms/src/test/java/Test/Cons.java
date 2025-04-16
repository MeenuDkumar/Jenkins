package Test;

public class Cons {
	int id;
	String name;
	Cons (int i,String n)
	{
	id =i;
	name =n;
	}
	
void  display()
	{
		System.out.println(id +""+name);
	}

	public static void main(String[] args) {
		Cons ob=new Cons(10 ,"Meenu");
		ob.display();
		// TODO Auto-generated method stub

	}

}
