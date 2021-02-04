package examples;

public class Nestedcatchwithfor {

	public static void main(String[] args)
	{
		String[] s = {"abc", "123", null, "xyz"};   
		 
        for (int i = 0; i < s.length; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);    
 
                
            }
 
            catch(NumberFormatException ex)
            {
                System.out.println("NumberFormatException occures");
            }
 
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("ArrayIndexOutOfBoundsException occurs");
            }
 
            catch (NullPointerException ex)
            {
                System.out.println("NullPointerException will be caught here");
            }
 
            System.out.println("main");
        }
	}

}
