
	package iocopy;
	import java.io.*;
	public class ioCopy {
		public static void main(String[] args) throws IOException
		{
			copy_2();
		}
		public static void copy_2()
		{
			FileWriter fw = null;
			FileReader fr = null;
			try{
				fw = new FileWriter("e:\\helloworld.tex");
			 fr = new FileReader("e:\\helloworld.java");
			 char[] buff = new char[1024];
			 int len = 0;
			 while((len = fr.read(buff)) != -1)
			 {
				fw.write(buff,0,len); 
			 }
			}
			catch(IOException e)
			{
				System.out.print(e.toString());
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
				}
				try
				{
				if(fr != null)
					fw.close();
				}
				catch(IOException e)
				{	
				}
			}
		}
	public static void copy_1() throws IOException
	{
		FileWriter fw = null;
		FileReader fr = null;
		try{
	    fw = new FileWriter("F:\\helloworld.txt");
	    fr = new FileReader("F:\\helloworld.java");
		}
		catch(IOException e)
		{
			System.out.print(e.toString());
		}
		finally
		{
				try{
					if(fw != null)
					fw.close();
					if(fr != null)
					fr.close();
				}
				catch(IOException e){
					System.out.print(e.toString());
				}
			}
		int num = 0;
		while((num = fr.read()) != -1)
		{
			fw.write(num);
		}
			
		}
		}

