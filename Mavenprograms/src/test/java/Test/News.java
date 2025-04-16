package Test;

public class News {
	int id,rollno;
	String name;
	News(int i,String n)
	
	{
		id =i;
		name =n;
	}
	News(int r,int i ,String n){
		id=i;
		name=n;
		rollno =r;
		
	}
	void display()
	{
		System.out.println(id+name+ rollno);
		
	}

	public static void main(String[] args) {
		News ob= new News(2,"Meenu");
		News obj= new News(2,5,"Meenu");
		ob.display();
		obj.display();
		
		
		// TODO Auto-generated method stub

	}

}
