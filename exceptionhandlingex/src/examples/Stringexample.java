package examples;

public class Stringexample {

	public static void main(String[] args) 
	{
		String s=null;
		try
		{
		String a=s.concat("abc");
		System.out.println(a);
		}
		catch(NullPointerException n)
		{
		System.out.println(s);
		}
	}

}
