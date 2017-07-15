package guvi;
import java.util.*;

public class Pro67 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = scan.nextInt();
		System.out.println("Enter the value of k : ");
		int k = scan.nextInt();
		System.out.println("Enter the String : ");
		String str = scan.nextLine();
		int a[] = new int[k];
		
		for(int i=0;i<k;k++){
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<k;i++){
			if(str.charAt(a[i]-1)=='0'){
				System.out.println("YES");
			}
			
				
		}
		System.out.println("No");
	}

}
