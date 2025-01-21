package LogicalStringTask;
import java.util.*;
public class EndWith {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next()+sc.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{

			if(a[i].endsWith("ing"))
			{
				System.out.println("words ending with ing = "+a[i]);
			}
		}


	}

}
