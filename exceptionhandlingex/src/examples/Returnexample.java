package examples;

public class Returnexample
{
		public static void main(String[] args)
	    {
	        System.out.println(methodReturningValue());    //Output : 10
	    }
	 
	    static int methodReturningValue()
	    {
	        try
	        {
	            return 10;  
	        }
	        catch (Exception e)
	        {
	            return 20;   
	        }
	        finally
	        {
	            //System.out.println("finally block is always executed");
	         
	           
	        }
	}
}
