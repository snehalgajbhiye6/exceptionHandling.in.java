package examples;
public class Throwexample 
{
    public void m1() throws Exception
    {
    	m2();
    	System.out.println("m1");
    }
    
    public void m2() throws Exception
    {
    	m3();
    	System.out.println("m2");
    }
    
    public void m3() throws Exception
    {
    	m4();
    	System.out.println("m3");
    }
    
    public void m4() throws Exception
    {
          try {
        	  int i=10/0;
          	
          }
          catch(Exception e)
          {
        	  System.out.println("Exception occured");
          }
    		
    	System.out.println("m4");
    }
    
    public static void main(String args[])
    {
    	Throwexample t=new Throwexample();
    	
        try {
        	t.m1();
        }
        catch(Exception e) {
        	System.out.println("Exception");
        }
    	System.out.println("main");
    }
}
