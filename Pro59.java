package guvi;
import java.util.*;

public class Pro59 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = scan.nextInt();
		int a[] = new int [n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
		}
		int p1=0,p2=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				p1 = p1 + a[i];
			}
			else{
				p2 = p2 + a[i];
			}
		}
		System.out.println("Sum of coins Player 1 : "+p1);
		System.out.println("Sum of coins Player 2 : "+p2);
		System.out.println();
		if(p1>p2){
			System.out.println("**** PLAYER 1 IS WIN ****");
			System.out.println("TOTAL COINS : "+p1);
		}
		else{
			System.out.println("**** PLAYER 2 IS WIN ****");
			System.out.println("TOTAL COINS : "+p2);
		}
		
	}

}
