package Test;

public class This {
	int id,rollno;
	String name;
	This (int id,int rollno,String name)
	
	{
		this.id=id;
		this.rollno=rollno;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+name+ rollno);
		
	}

	public static void main(String[] args) {
		This ob= new This (2,8,"Meenu");
		This obj= new This(2,5,"Neenu");
		ob.display();
		obj.display();
		

	
}
}
