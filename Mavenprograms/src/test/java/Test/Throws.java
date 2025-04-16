package Test;

import java.io.IOException;

public class Throws  {
	void m()throws IOException
	{
	throw new IOException("Device error");	
	}
	

	public static void main(String[] args) {
		try
		{
			Throws ob =new Throws();
			ob.m();
		}
		catch(IOException e)
		{
			System.out.println("Exception handled");
			
		}
		System.out.println("Remaining code");
		// TODO Auto-generated method stub

	}

}
