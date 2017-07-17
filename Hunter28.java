package guvi;
import java.util.*;

public class Hunter28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		char c1[] = str.toCharArray();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(c1[i] == c1[j]){
					c1[i]='\0';
				}
			}
		}
		for(int i=str.length()-1;i>=0;i--){
			if(c1[i]!='\0'){
				System.out.println(c1[i]);
			}
		}
	}

}
