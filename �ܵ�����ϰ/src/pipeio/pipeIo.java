package pipeio;
import java.io.*;
public class pipeIo {
public static void main(String[] args) {
	try{
	PipedInputStream in = new PipedInputStream();
	PipedOutputStream out = new  PipedOutputStream();
	in.connect(out);
	Read rd = new Read(in);
	Write wt = new Write(out);
	new Thread(rd).start();
	new Thread(wt).start();
	}
	catch(IOException e){
		throw new RuntimeException("Á¬½ÓÊ§°Ü"); 
	}
}
}
class Read implements Runnable{
	private PipedInputStream in;
	public Read(PipedInputStream in){
	  this.in = in;
	}
	public void run(){
		try{
			System.out.print("¿ªÊ¼¶Á");
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String s = new String(buf,0,len);
			System.out.print(s);
			}
			catch(IOException e){
				throw new RuntimeException("¶ÁÊ§°Ü"); 
			}
			finally{
				try{
				in.close();
				}
				catch(IOException e){
					throw new RuntimeException("¹Ø±ÕÊ§°Ü"); 
				}
				
			}
	}
}
class Write implements Runnable{
	private PipedOutputStream out;
	public Write(PipedOutputStream out){
	  this.out = out;
	}
	public void run(){
		try{
			System.out.print("¿ªÊ¼Ð´");
			//byte[] buf = new byte[1024];
			out.write("²ñ½ðÐñ".getBytes());
			}
			catch(IOException e){
				throw new RuntimeException("Ð´Ê§°Ü"); 
			}
			finally{
				try{
				out.close();
				}
				catch(IOException e){
					throw new RuntimeException("¹Ø±ÕÊ§°Ü"); 
				}
				
			}
	}
}
