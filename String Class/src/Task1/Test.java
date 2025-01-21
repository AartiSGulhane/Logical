package Task1;

public class Test {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="Hello";
		String c="Hiii";
		String d="HELLO";
		String e="";
		String f="    Hello World   ";
		
		
		System.out.println("equals method");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println("\nContains method");
		System.out.println(a.contains("He"));
		System.out.println(a.contains("o"));
		System.out.println(a.contains("Hi"));
		
		System.out.println("\n replace method ");
		System.out.println(a.replace('H', 'P'));
		
		System.out.println("\n concat method");
		System.out.println(a.concat(c));
		
		System.out.println("\n charAt method");
		System.out.println(a.charAt(1));
		
		System.out.println("\n equalsIgnoreCase");
		System.out.println(a.equalsIgnoreCase(d));
		System.out.println(a.equalsIgnoreCase(c));
		
		System.out.println("\n length method");
		System.out.println(a.length());
		
		System.out.println("\n indexOf method");
		System.out.println(a.indexOf('l'));
		System.out.println(a.indexOf("lo"));
		
		System.out.println("\nlastIndexOf method");
		System.out.println(a.lastIndexOf("lo"));
		
		System.out.println("\n isEmpty method");
		System.out.println(a.isEmpty());
		System.out.println(e.isEmpty());
		
		System.out.println("\n trim method");
		System.out.println(f.trim());
		
		System.out.println("\n split method");
		String g="java string split method";
		String s[]=g.split("s");
		for(String x:s) {
			System.out.println(x);
		}
		
		System.out.println("\n intern method");
		String p=new String("Welcome to CJC");
		String q=new String("Welcome to CJC");
		System.out.println(p==q);     //false- diff mem loc
		
		String y=new String ("Welcome to CJC").intern();
		String z=new String("Welcome to CJC").intern();
		System.out.println(y==z);      // true- same mem loc
		
		System.out.println("\n compareTo method");
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(d));
		
		System.out.println("\nsubString method");
		System.out.println(a.substring(1,3));
		System.out.println(a.substring(2));
		
		System.out.println("\n toCharArray method");
		char arr[]=a.toCharArray();
		System.out.println(arr);
		
		
		System.out.println("\n toLowerCase method");
		System.out.println(d.toLowerCase());
		
		System.out.println("\n toUpperCase method");
		System.out.println(a.toUpperCase());
		
		System.out.println("\n compareToIgnoreCase method");
		System.out.println(a.compareToIgnoreCase(d));   // returns 0 if string is equal
		
		System.out.println("\nstartsWith method");
		System.out.println(a.startsWith("He"));
		
		System.out.println("\n endsWith method");
		System.out.println(a.endsWith("O"));     //returning false as it is case sensitive 
		
		System.out.println("\n hashCode method");
		System.out.println(c.hashCode());
		
		System.out.println("\n valueOf method");
		System.out.println(String.valueOf(a));
		
		System.out.println("\n matches method");
		System.out.println(a.matches(c));
		
	}

}
