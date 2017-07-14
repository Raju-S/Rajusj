package guvi;
import java.util.*;

public class Hunter125 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.next();
		
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i+2;j<=str.length();j++)
			{
				if(str.substring(i,j).equalsIgnoreCase((new StringBuffer(str.substring(i, j)).reverse()).toString()))
				{
					System.out.println(str.subSequence(i, j));
				}
			}
}

	}

}
