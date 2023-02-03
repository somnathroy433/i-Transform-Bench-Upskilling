/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<String> L1= new ArrayList<String>();
	    L1.add("red");
	    L1.add("blue");
	    L1.add("green");
	    L1.add(0,"pink");
		System.out.println(L1);
		for(String element : L1)
		{
		    System.out.println(element);
		}
		L1.set(1,"black");
		L1.remove(2);
		System.out.println(L1);
		String element=L1.get(1);
		System.out.println("2nd element is : "+ element);
		if(L1.contains("white"))
		{
		    System.out.println("found the element");
		}
		else
		    System.out.println("element is not there");
		Collections.sort(L1);
		System.out.println("After sorting the list:"+ L1);
	}
}
