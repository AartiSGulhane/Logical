package LogicalStringTask;
import java.util.*;
public class EvenLengthWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=sc.next()+sc.nextLine();
		String [] a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i].length()%2==0)
			{
				System.out.println("Word length is even"+a[i]);
			}
		}
		
	}

}
