package examples;

public class Nestedcatch
{
    public static void main(String args[])
    {
    	String s="abcr";
    	
    	int a=0;
    	try
    	{
    		a=Integer.parseInt(s)+Integer.parseInt(args[2]);
    	}
    	catch(NumberFormatException n)
    	{
    		System.out.println("NumberFormatException occured.");
    	}
    	catch(ArrayIndexOutOfBoundsException i)
    	{
    		System.out.println("ArrayIndexOutOfBoundsException occured");
    	}
    	catch(Exception e)
    	{
    		System.out.println("Parent exception occured");
    	}
    	System.out.println(a);
    	System.out.println(s);
    }
}
