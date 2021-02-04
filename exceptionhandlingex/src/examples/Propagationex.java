package examples;

import java.io.IOException;

class Parent{
	public void m1()throws IOException
	//public void m1()throws ArithmeticException

	{
		System.out.println("m1");
	}
}

class Child extends Parent
{
	public void m2() 
	{
		System.out.println("m2");
	}
}
public class Propagationex {

	public static void main(String[] args) throws IOException 
	{
		Child c=new Child();
		c.m1();
	
	}

}
