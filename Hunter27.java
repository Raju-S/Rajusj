package guvi;
import java.util.*;

public class Hunter27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		if(str.length()%2==0){
			System.out.println("Length is : "+str.length());
		}
		else{
			System.out.println("Length is : "+(str.length()-1));
		}

	}

}
