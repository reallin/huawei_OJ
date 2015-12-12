package readlinedemo;

import java.io.*;;

public class readLineDemo {
public static void main(String[] args)
{
	FileReader fr = null;
	BufferedReader buf = null;
	try{
	 fr = new FileReader("e:\\helloworld.java");
	 buf = new BufferedReader(fr);
	 while(buf.readLine() != null)
	 {
		 System.out.print(buf.readLine());
	 }
	}
	catch(IOException e)
	{
		throw new RuntimeException("¶ÁÐ´Ê§°Ü");
	}
	finally
	{
		try
		{
			if(fr != null)
			fr.close();
		}
		catch(IOException e)
		{
			System.out.print(e.toString());
		}
		try
		{
			if(buf != null)
		    buf.close();
		}
		catch(IOException e)
		{
			System.out.print(e.toString());
		}
	}
	}
}
