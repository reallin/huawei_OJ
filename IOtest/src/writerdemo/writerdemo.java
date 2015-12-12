package writerdemo;
import java.io.*;
public class writerdemo {
	public static void main(String[] args)  {
		FileWriter fw = null;
		try{
		fw = new FileWriter("k:\\demo.txt");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally{
			try{
				if(fw != null)
		       fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
	}
}
