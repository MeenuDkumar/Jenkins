package Package2;

import java.io.IOException;

public class Excel2 {

public static void main(String args[]) throws IOException {
	

Excel1 ob =new Excel1();
String a=ob.readData(0, 0);
System.out.println("Value of a="+a);
String b=ob.readData(0, 1);
System.out.println("Value of b="+b);

}
}