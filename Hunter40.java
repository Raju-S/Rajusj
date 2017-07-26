package guvi;
import java.util.*;

public class Hunter40 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = scan.nextInt();
	
		int mod=0,sum=0,pali=0;
		while(n>0){
			mod = n%10;
			sum = sum + mod;
			n/=10;
		}
		String str1 = Integer.toString(sum);
		while(sum>0){
			mod = sum%10;
			pali = pali*10+mod;
			sum/=10;
		}
		String str2 = Integer.toString(pali);
		if(str1.equals(str2)){
			System.out.println("Palindrome number");
		}
		else{
			System.out.println("Not palindrome number");
		}

	}

}
