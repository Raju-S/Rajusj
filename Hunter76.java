package guvi;
import java.util.*;

public class Hunter76 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int num = scan.nextInt();
		int mark[] = new int[6];
		int sum = 0;
		float avg = 0;
		for(int i=0;i<num;i++){
			System.out.println("Enter the "+(i+1)+" Student Marks ");
			
			mark[i] = scan.nextInt();
			sum = sum + mark[i];
		}
		avg = sum/num;
		Arrays.sort(mark);
		System.out.println("Sorting the Student marks");
		for(int a1 : mark){
			if(a1!=0)
			System.out.println(a1);
		}
		System.out.println("Sum : "+sum);
		System.out.println("Average of "+num+" Students is : "+avg);
	}

}
