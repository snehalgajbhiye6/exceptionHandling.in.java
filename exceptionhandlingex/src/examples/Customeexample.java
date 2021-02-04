package examples;

import java.util.Scanner;

class PinNotFoundException extends Exception
{
	public PinNotFoundException(String msg)
	{
		super(msg);
	}
}
public class Customeexample {

	public static void main(String[] args) 
	{
	    final int pin=1234;
	    
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter pin");
         int upin=sc.nextInt();
         
         if(pin==upin)
         {
        	 System.out.println("Valid pin");
         }
         else
         {
        	 try
        	 {
        		 throw new PinNotFoundException("Invalid pin");
        	 }
        	 catch(PinNotFoundException e)
        	 {
        		 System.out.println(e.getMessage());
        	 }
        	 
         }
	}

}
