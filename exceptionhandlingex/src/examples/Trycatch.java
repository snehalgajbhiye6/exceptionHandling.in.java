package examples;

public class Trycatch {

	public static void main(String[] args)
	{
		int i=0;
        try
        {
        	 i=10/0;
        }
        catch(Exception e)
        {
        	System.out.println("Exception occured");
        }
        finally
        {
        	System.out.println(i);
        	
        }
	}

	
}
