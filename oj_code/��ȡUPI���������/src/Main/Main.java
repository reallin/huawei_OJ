package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		File f = new File("E:\\易团队\\UPI\\UPI问题.docx");
		String fileName = "E:\\ceshi.txt";
		try {
			BufferedReader bi = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			String s;
			while((s = bi.readLine())!=null){
				
				sb.append(s);
			}
			System.out.print(sb.toString());
			//ArrayList<String> alist = new ArrayList<String>();
			String[] array =sb.toString().split("\\d"+".");
			for(int i = 0;i < array.length;i++){
				
			}
			System.out.print(array.length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
