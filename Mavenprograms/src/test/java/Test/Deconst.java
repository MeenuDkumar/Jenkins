package Test;

public class Deconst {
	Deconst(int x)
	{
		System.out.println(x);
	}
	Deconst()
	{
		this(20);
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		Deconst ob =new Deconst();
		
		// TODO Auto-generated method stub

	}

}
