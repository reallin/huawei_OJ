
package propertiestext;
import java.util.*;
import java.io.*;
public class propertiesText {
	public static void main(String[] args){
		String s = "D:\\a.txt";
		String a = "D:\\b.txt";
		//getPro(s);
		getCount(a);
	}
	public static void getCount(String s){
		File f = new File(s);
		if(!f.exists()){
			try{
			f.createNewFile();
			}
			catch(IOException e){
				throw new RuntimeException(" ß∞‹");
			}
		}

			Reader fw = null;
			FileWriter fos = null;
			try{
			    fw = new FileReader(f);
			    Properties pri = new Properties();
			    fos = new FileWriter(f);
			    pri.load(fw); 
			int count = 0;
			String value = pri.getProperty("num");
			if(value != null)
			count = Integer.parseInt(value);
			count++;
			pri.setProperty("num", count+"");
            
			pri.store(fos,"");
			}
			catch(IOException e){
				throw new RuntimeException(" ß∞‹");
			}
			finally{
				if(fw != null)
				try{
					fw.close();
				}
				catch(IOException e){
					throw new RuntimeException(" ß∞‹");
				}
				if(fos != null)
					try{
						fos.close();
					}
					catch(IOException e){
						throw new RuntimeException(" ß∞‹");
					}
			}
		}

	public static void getPro(String s){
		Properties pri = new Properties();
		BufferedReader buf = null;
		FileOutputStream fos = null;
		try{
			buf = new BufferedReader(new FileReader(s));
			String line = null;
			while((line = buf.readLine()) != null){
				String[] arr = new String[2];
				arr = line.split("=");
				pri.setProperty(arr[0].toString(), arr[1].toString());
				
			}
			fos = new FileOutputStream(s);
			pri.store(fos,"haha");
			pri.list(System.out);
			//System.out.print(pri);
		}
		catch(IOException e){
			throw new RuntimeException(" ‰»Î ß∞‹");
		}
		finally{
			if(buf != null){
				try{
					buf.close();
				}
				catch(IOException e){
					throw new RuntimeException("¡˜πÿ±’ ß∞‹");
				}
			
		}
			if(fos != null){
				try{
					fos.close();
				}
				catch(IOException e){
					throw new RuntimeException("¡˜πÿ±’ ß∞‹");
				}
		}
	}
}
}
