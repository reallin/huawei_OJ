package printdemo;
import java.io.*;
import java.text.*;
import java.util.*;
public class printDemo {
   public static void main(String[] args){
	   try{
		   int[] arr = new int[2];
		   System.out.print(arr[4]);
	   }
	   catch(Exception e){
		   try{
			   Date a = new Date();
			   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  E HH:mm:ss");
			   String s = sdf.format(a);
			   PrintStream ps = new PrintStream("d:\\print.log");
			   ps.println(s);
			   Properties prop = System.getProperties();
			   System.setOut(ps);
			   prop.list(ps);
			  
		   }
		   catch(Exception ex){
			   
		   }
		   e.printStackTrace(System.out);
	   }
   }
}
