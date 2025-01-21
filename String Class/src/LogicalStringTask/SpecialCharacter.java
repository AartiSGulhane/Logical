package LogicalStringTask;
import java.util.*;
public class SpecialCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='A' && s.charAt(i)<='Z'|| s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)==' '))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Special character is not present in String");
		}
		else
		{
			System.out.println("Special character or number found in String");
		}
		

	}

}
