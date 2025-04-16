package Test;

public class Sampl extends Sup {
	String colour="BLACK";
	

	void print()
	{
		System.out.println(super.colour);
		System.out.println(colour);
		
	}

	public static void main(String[] args) {
		Sampl ob= new Sampl();
		ob.print();
		
		
		// TODO Auto-generated method stub

	}

}
