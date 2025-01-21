package LogicalStringTask;
import java.util.*;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next();
		System.out.println("Enter any character present in String");
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}

		}

		if(count==0)
		{
			System.out.println("required character is not present");	
		}
		else {
			System.out.println("No of count="+count);
		}


	}

}
