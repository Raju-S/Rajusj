package guvi;
import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		int alplen = 26;
		int len = str.length();
		if(len<alplen){
			System.out.println("Not pangram");
		}
		else{
			for (char c = 'A'; c <= 'Z'; c++) {
				if ((str.indexOf(c) < 0) && (str.indexOf((char) (c + 32)) < 0)) {
					System.out.println("Not pangram");
				}
			}
			System.out.println("Pangram");
		}
	}

}
