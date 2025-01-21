package LogicalStringTask;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next()+sc.nextLine();
		System.out.println("Origional String is : "+s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("String is palindrome : "+rev);
		}else
		{
			System.out.println("String is not palindrome : "+rev);
		}

	}

}
