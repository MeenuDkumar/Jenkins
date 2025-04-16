package Test;

public class Sum {
 int add (int a,int b) {
	 return a+b;
 }
 float add(float a,float b)
	{
		return a+b;
	}
 public static void main(String[] args) {
		Sum ob=new Sum();
		System.out.println(ob.add(5, 10));
		System.out.println(ob.add(12.2f, 5.5f));
	 
	 
	
}
}


