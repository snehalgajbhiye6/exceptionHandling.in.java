package examples;

public class Nestedtry {

	public static void main(String[] args) 
	{
		String s="abc";
		int a=0,b=0;
		
		try
		{
		    //int i=10/0;

			try
			{
				a=Integer.parseInt(s);
			}
			catch(NumberFormatException m)
			{
				System.out.println("Number format exception occured");
			}
			try
			{
				b=Integer.parseInt(args[4]);
			}
			catch(ArrayIndexOutOfBoundsException m)
			{
			
				System.out.println("Array Index Out Of Bounds Exception occured");
			}
			
		}
		catch(Exception n)
		{
			System.out.println("Exception occured");
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
