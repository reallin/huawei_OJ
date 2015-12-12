package copypic;
import java.io.*;
public class copyPic {
	public static void main(String[] args){
		String s1 = "e:\\1.jpg";
		String s2 = "e:\\2.jpg";
		long a = System.currentTimeMillis();
		copy_1(s1,s2);
		long b = System.currentTimeMillis();
		System.out.print(b-a);
	}
	public static void copy_1(String a,String b){
		BufferedInputStream bi = null;
		BufferedOutputStream bo = null;
		try{
			bi = new BufferedInputStream(new FileInputStream(a));
			bo = new BufferedOutputStream(new FileOutputStream(b));
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = bi.read(buf)) != -1){
				bo.write(buf,0,len);
			}
		}
			catch(IOException e){
				throw new RuntimeException("∏¥÷∆ ß∞‹");
				//System.out.print(e.toString());
			}
		finally{
			try{
				if(bi != null){
					bi.close();
				}
			}

			catch(IOException e){
				throw new RuntimeException("πÿ±’ ß∞‹");
			}
			try{
				if(bo != null){
					bo.close();
				}
			}

			catch(IOException e){
				throw new RuntimeException("πÿ±’ ß∞‹");
			}
		}
		}
	}

