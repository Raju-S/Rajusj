package guvi;
import java.util.*;

public class Hunter41 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String,String> map = new HashMap<String,String>();
		map.put("luke", "shaw");
		map.put("wayne", "rooney");
		map.put("rooney", "ronaldo");
		map.put("shaw", "rooney");
		
		System.out.println("Enter the Fathername : ");
		String str = scan.next();
		String s2 = "";
		int count = 0;
		
				for(Map.Entry em : map.entrySet()){
					
					String s1 = (String) em.getValue();
					
					if(s1.equals(str)){
						
						s2 = (String) em.getKey();
						
					}
				}
				System.out.println("Child name : "+s2);

				
				for(Map.Entry em : map.entrySet()){
					
					if(s2.equals(em.getValue())){
						count++;
					}
				}
				System.out.println("GrandChildren : "+count);

	}

}
