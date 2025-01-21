package LogicalStringTask;
import java.util.*;

public class FirstLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.next();
		String a[]=s.split(" ");
		char ch=0;
		
		for(int i=0;i<a.length;i++)
		{
			ch=s.charAt(i);
			
			System.out.println("First letter of String "+a[i]+" is : "+ch);

		}
		
	}

}
