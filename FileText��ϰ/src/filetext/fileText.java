package filetext;
import java.io.*;
import java.util.*;
public class fileText {
  public static void main(String[] args){
	  ArrayList<File> alist = new ArrayList<File>();
	  String s = "D:\\1";
	  String a = "D:\\a.txt";
	  toList(s,alist);
	  toFile(a,alist);
	  toDelete(s);
	  //System.out.print(alist.size());
  }
  public static void toFile(String s,List<File> list) {
	  BufferedWriter bw = null;
	  try{
	  bw = new BufferedWriter(new FileWriter(s));
	  for(File f:list){
	      String str = f.getAbsolutePath();
		  bw.write(str);
		  bw.newLine();
		  bw.flush();
	  }
	  }
	  catch(IOException e){
		  throw new RuntimeException("×ª»»Ê§°Ü");
	  }
	  finally{
		  if(bw != null){
			  try{
				  bw.close();
			  }
		  catch(IOException e){
			  throw new RuntimeException("×ª»»Ê§°Ü");
		  }
		  }
	  }
  }
  public static void toDelete(String s){
	  File f = new File(s);
	  File[] buf = f.listFiles();
	  for(File f1:buf)
	  if(f1.isDirectory()){
		  toDelete(f1.getAbsolutePath());
	  }
	  else
		  f1.delete();
	  f.delete();
  }
  public static void toList(String s,List<File> list){
	  File f1 = new File(s);
	  File[] buf = f1.listFiles();
	  for(int i = 0;i < buf.length;i++)
	  if(buf[i].isDirectory()){
		  toList(buf[i].getAbsolutePath(),list);
	  }
	  else
		  list.add(buf[i]);
	  
  }
}
