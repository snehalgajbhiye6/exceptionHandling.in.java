package examples;

public class Arithmaticexample {

	public static void main(String[] args) 
	{
        try
        {
        	int i=10/0;
        	System.out.println(i);
        }
        catch(ArithmeticException e) {
        	System.out.println("Exception occured");
        }
	}

}
