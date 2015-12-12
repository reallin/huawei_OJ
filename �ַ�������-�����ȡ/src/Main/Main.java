package Main;
/**
 * 返回有效密码串的最大长度 如ABBA为4，
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	  int count = 0;
	  int flag = 0;
	  int max = 0;
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	 int[] array = new int[1000];
	// System.out.print(s);
	 if(str.length() == 1){
		 System.out.print("1");
	 }
	 else{
	   for(int i = 0;i < str.length()-2;i++){   //从第一个字符开始检索，
		  for(int j =i+3 ;j <= str.length();j++){  //字符串长至少为3，从3开始到结束,
			  flag = 0;
			  String s =str.substring(i,j);  //截取下字符串
			  for(int k = 0;k < s.length()/2;k++){
				 if(s.charAt(k) != s.charAt(s.length()-k-1)){
					 flag = 1;
				 }
			  }
			  if(flag != 1){
				  array[count] = (j-i);
				  if(array[count] > max){
					  max = array[count];   //把最长串记录下
				  }
				  count++;
			  }  
		  }
  }
	   System.out.print(max);
	 }
	   sc.close();
  }
}


