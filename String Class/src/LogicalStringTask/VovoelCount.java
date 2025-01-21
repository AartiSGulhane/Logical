package LogicalStringTask;
import java.util.*;
public class VovoelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Vovels are not present in String");
		}else
		{
			System.out.println("No of Vovels present in String= "+count);
		}

	}
}
