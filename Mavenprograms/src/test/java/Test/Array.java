import java.util.*;
package Test;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Meenu");
		list.add("Meenu");
		list.add("Deepu");
		list.add("Ambu");
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}

}
