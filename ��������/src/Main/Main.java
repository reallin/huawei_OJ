package Main;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static String yxj="+- */";
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String newstr=str.replace('[', '(').replace(']', ')').replace('{', '(').replace('}', ')');
		String result=String.valueOf(calculate(newstr));
		if(result.split("\\.")[1].equals("0")){
			System.out.print(result.split("\\.")[0]);
		}else{
			System.out.print(result);
		}
		sc.close();
	}
	
	 public static Double calculate(String str){
		Pattern patt=Pattern.compile("\\([^\\(\\)]+\\)");
		Matcher mat=patt.matcher(str);	
		String re=str;
		while(mat.find()){
			String temstr=mat.group();
			//对于具有输入序列 s 的匹配器 m，表达式 m.group() 和 s.substring(m.start(), m.end()) 是等效的。 
			String res=tempcal(temstr);
			String nt=mat.replaceFirst(res);
			re=nt;
			mat=patt.matcher(nt);
		}
		re="("+re+")";
		 return Double.parseDouble(tempcal(re));
	 }
	 
	 public static String tempcal(String strs){
		 String str=strs.substring(1,strs.length());
		 Stack<String> s1=new Stack<String>();
		 Stack<String> s2=new Stack<String>();
		 Stack<Double> s3=new Stack<Double>();
		 Pattern patt=Pattern.compile("\\d+(\\.\\d++)*|\\+|\\-|\\*|/");//除/不需要转义
		 Matcher mat=patt.matcher(str);
		 while(mat.find()){
			String temstr=mat.group();
			if(temstr.matches("^\\d+(\\.\\d++)*$")){
				s1.push(temstr);
			}else{
				if(s2.empty()){
					s2.push(temstr);
				}else{
					while(!(s2.empty())&&!((yxj.indexOf(temstr)-yxj.indexOf(s2.peek()))>=2)){
						String temp=s2.pop();
						s1.push(temp);
					}
					s2.push(temstr);
					
				}
			}
		}
		 while(!(s2.empty())){
			 s1.push(s2.pop());
		 }
		 
		 for(int i=0;i<s1.size();i++){
			 String tempnum=s1.get(i);
			 if(tempnum.matches("^\\d+(\\.\\d++)*$")){
				 s3.push(Double.parseDouble(tempnum));
			 }else{
				 if(s3.size()>1){
					 Double num1=s3.pop();
					 Double num2=s3.pop();
					 Double result=0.0;
					 if(tempnum.matches("^\\+$")){
						 result=num2+num1;
					 }else if(tempnum.matches("^\\-$")){
						 result=num2-num1;
					 }else if(tempnum.matches("^\\*$")){
						 result=num2*num1;
					 }else if(tempnum.matches("^/$")){
						 result=num2/num1;
					 }
					 s3.push(result);
					 
				 }else{
					 Double a=s3.peek();
					 if(tempnum.matches("\\-")){
						 a=0-a;
					 }
					 s3.pop();
					 s3.push(a);
				 }
			 }
		 }
		 
		 return String.valueOf(s3.pop());
	 }

}

