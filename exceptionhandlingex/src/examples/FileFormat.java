package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileFormat 
{
    public static void main(String args[])
    {
    	try {
			FileReader f=new FileReader(new File("f.java"));
		} catch (FileNotFoundException e) {
			
			System.out.println("file");
		}
    }
}
