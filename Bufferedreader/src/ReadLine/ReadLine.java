package ReadLine;

import java.io.*;;

public class ReadLine {
	
	public static void readline(FileReader fr,String s)
	{
		BufferedReader buf = null;
		try{
			 fr = new FileReader(s);
			 buf = new BufferedReader(fr);
			 String line = null;
			 while((line = buf.readLine()) != null)
			 {
				 System.out.println(line);
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

public static void main(String[] args)
{  
	 FileReader fr = null;
		String s = "e:\\helloworld.java";

	try{
		fr = new FileReader(s);
		MyLineNumberReader mn = new MyLineNumberReader(fr);
		String Line = null;
		mn.setLine(3);
		while((Line = mn.MyLineNumberReaderReadLine())!=null){
		
		System.out.println(mn.getLine()+"::"+Line);
		}
	}
	catch(IOException e){
		
	}
	finally{
		try{
			if(fr != null){
				fr.close();
			}
		}
			catch(IOException e){
				
			}
	/*
    FileReader fr = null;
	String s = "e:\\helloworld.java";
	try{
		fr = new FileReader(s);
		MyBufferedReader mb = new MyBufferedReader(fr);
		String Line = null;
		while((Line = mb.myReadLine())!=null)
		System.out.println(Line);
	}
	catch(IOException e){
		
	}
	finally{
		try{
			if(fr != null){
				fr.close();
			}
		}
			catch(IOException e){
				
			}
		
	}*/
	//fr = new FileReader("e:\\helloworld.java");
	//readline(fr,s);*/
	}
}
}
class MyBufferedReader{
	private Reader r;
	MyBufferedReader(Reader a){
		this.r = a;
	}
	public String myReadLine() throws IOException{
	StringBuilder sb = new StringBuilder();
	int num;
	while((num = r.read()) != -1){
		if(num == '\r')
			continue;
		if(num == '\n')
			return sb.toString();
		else
			sb.append((char)num);	
	}
	return null;
}
	public void myClose() throws IOException{
		r.close();
	}
}
class MyLineNumberReader extends MyBufferedReader{
	//private Reader r;
	private int line;
	MyLineNumberReader(Reader r){
		super(r);
	}
	public void setLine(int line){
		this.line = line;
	}
	public int getLine(){
		return this.line;
	}
	public String MyLineNumberReaderReadLine() throws IOException{
		line++;
		return super.myReadLine();
	}
}
