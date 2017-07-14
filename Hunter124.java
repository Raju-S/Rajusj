package guvi;
import java.util.*;

public class Hunter124 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.nextLine();
		String[] ch=str.split("\\s");
		int len = ch.length;

		int count=0,count1=0;
		for(String name:ch)
		{
		if(Character.isUpperCase(name.charAt(0))){
			count++;
			}
		else
			count1++;
		}
		if(count==ch.length)
			System.out.println("CamelCase:");
		else
		System.out.println("Not a CamelCase:");
		
	    


	}

}
