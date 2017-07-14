package guvi;
import java.util.*;

public class Hunter123 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		int len = str.length();
		for(int i=0;i<len;i++){
			int count=0;
			for(int j=0;j<len;j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
			if(count==1){
				System.out.println(str.charAt(i));
			}
			
		}
		
	}
}