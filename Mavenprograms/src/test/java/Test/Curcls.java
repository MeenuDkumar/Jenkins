package Test;

public class Curcls {
	void m()
	{
		System.out.println("Hai");
	}
	void n()
	{
		this.m();
		System.out.println("Hai Deepu");
	}

	public static void main(String[] args) {
		Curcls ob =new Curcls();
		ob.n();
		// TODO Auto-generated method stub

	}

}
