package propertiestest;
import java.util.*;
import java.io.*;
public class propertiesTest {
	public static void main(String[] args){
		String s = "D:\\a.txt";
		getPro(s);
	}
	public static void getPro(String s){
		Properties pri = new Properties();
		BufferedReader buf = null;
		try{
			buf = new BufferedReader(new FileReader(s));
			String line = null;
			while((line = buf.readLine()) != null){
				String[] arr = line.split("=");
				pri.setProperty(arr[0], arr[1]);
			}
			System.out.print(pri);
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
		}
	}
}
