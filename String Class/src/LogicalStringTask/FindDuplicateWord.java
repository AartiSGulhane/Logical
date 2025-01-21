package LogicalStringTask;

import java.util.Scanner;

public class FindDuplicateWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int count;
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="0";
				}
			}
		if(a[i] !="0" &&count>1)
		{
			System.out.println("Duplicate words are : "+a[i]);
		}
		}
		

	}

}
