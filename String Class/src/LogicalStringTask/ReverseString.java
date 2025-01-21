package LogicalStringTask;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.next()+sc.nextLine();
		System.out.println("Origional String is : "+s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse String is : "+rev);
		
		

	}

}
