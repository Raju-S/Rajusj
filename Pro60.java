package guvi;
import java.util.*;

public class Pro60 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int start = 3, rem = 3;
		
			for (int i = 1; i <= n; i++) {
				int temp = 0;
				if (start == 1) {
					temp = start;
					rem *= 2;
					start = rem;
				} else {
					temp = start--;
				}
				if (i == n)
					System.out.println(temp);
			}
		
	}

}
