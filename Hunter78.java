package guvi;
import java.util.*;

public class Hunter78 {

	public static void main(String[] args) {
		
		List<Integer> L1 = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = scan.nextInt();
		int m=0,j=0;
		for(int i=0;i<n;i++){
			
			L1.add(scan.nextInt());
		}
		
		System.out.println(L1);
		
		int len = L1.size();
		if(len%2==0){
			m = (len/2)-1;
			j=L1.get(m+1);
			System.out.println(j);
		}
		else{
			m=len/2;
			j=L1.get(m);
			System.out.println(j);
		}
	
	}

}
