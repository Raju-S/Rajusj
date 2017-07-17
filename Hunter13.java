package guvi;

import java.util.*;

public class Hunter13 {

	public static void main(String[] args) {
		int i=0;
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("m");
		l1.add("a");
		l1.add("d");
		l1.add("a");
		l1.add("m");
	
		
		Iterator<String> it = l1.iterator();
		
		for(i=0;i<=l1.size();i++){
			if(l1.get(i)==l1.get(l1.size()-1)){
				
				System.out.println("Palindrome");break;
			}
			else{
				System.out.println("Not palindrome");break;
			}
		}
			

	}

}
