package LogicalStringTask;
import java.util.*;
public class AskiiValue {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String");
	String s=sc.next();
	
	char ch=0;
	int val=0;
	for(int i=0;i<s.length();i++)
	{
			ch=s.charAt(i);
			val=ch;
			System.out.println("Ascii value of "+ch+" is : "+val);

	}

	}

}
