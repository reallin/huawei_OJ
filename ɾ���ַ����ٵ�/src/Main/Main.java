package Main;
/**
 * 删除字符串中出现次数最少的字符
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[] arry = new int[1000];
	   Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   char[] arry1 = str.toCharArray();  //方便后面当个添加
	   StringBuilder sb= new StringBuilder();  //用于存放最终字符串
	   int num = 0;
	   int temp;
	   int temp1;
	   int min = 20;
	   if(str.length() > 20){
		   System.out.print("字符数超过20");
	   }
	   else{
	   for(int i = 0 ;i < str.length() ;i++){    
		   for(int j = 0; j <str.length();j++){
			   temp = str.charAt(i);
			   temp1 = str.charAt(j);
			   if(temp == temp1){
				   num++;      //计重复数
			   }
		   }
		   arry[i] = num;
		   if(num < min){   //找出最小的个数值
			   min = num;       
		   }
		   num = 0;
	   }
	   for(int i = 0 ;i < str.length() ;i++){
		   if(arry[i] != min){    //找出元素个数不是最小的那些
			   sb.append(arry1[i]);  //添加到sb中
		   }
	   }
	   System.out.print(sb);
	   sc.close();
	}
	}
}
