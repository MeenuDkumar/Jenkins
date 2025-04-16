package Test;

public class Supers extends Super{
String name="Deepu";
   void display()
{
	System.out.println(super.name);
	System.out.println(name);
	
}

	public static void main(String[] args) {
		Supers ob =new Supers();
		ob.display();
		
		// TODO Auto-generated method stub

	}

}
