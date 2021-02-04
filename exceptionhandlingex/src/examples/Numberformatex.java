package examples;

import java.util.Scanner;

public class Numberformatex {

	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int i=0;
        String s="abc";
        
        try {
        	i=Integer.parseInt(s);
        }
        catch(NumberFormatException e)
        {
        	System.out.println("Exception occured");
        }
        catch(Exception e)
        {
        	System.out.println("2");
        }
	}

}
