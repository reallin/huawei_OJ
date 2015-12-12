package Main;
/**
 * 选取最小长度内G与C最多的字符串。
 */
import java.util.Scanner;
public class Main {
public static void main(String[] args){
   int temp = 0;
   int num = 0;
   int max = 0;
   int flag = 0;
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   int str1 =sc.nextInt();
   for(int i = 0;i < str.length()-str1;i++){   //从第一个字母开始到第len-str个
	   String str2 = str.substring(i,i+str1);   //截取最小长度字符串
	  for(int j = 0;j < str1;j++){
		  temp = str2.charAt(j);       //取出要比较字母
		  if(temp == 'G'||temp == 'C'){
		  num++;
	}
	  }
	  if(num > max){     //把最多G与C的i值记录下
		  max = num;
		  flag = i;
	  }
	  num = 0;
}
   System.out.print(str.substring(flag,flag+str1));
    sc.close();
	}
}
