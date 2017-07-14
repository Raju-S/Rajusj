package guvi;
import java.util.*;

public class Hunter26 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		System.out.println("The list elements are :");
		ListIterator<Integer> it = a1.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("The reverse order of list is : ");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		}

}
