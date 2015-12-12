package Main;
/**
 * 判断一个IP是否合法，如输出YES，不合法输出NO
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int num = 0;
	int count = 0;
	 Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   char[] arry = str.toCharArray();
	   for(int i = 0;i < str.length();i++){
		   if (arry[i] != '.' && (arry[i]<'0'||arry[i]>'9')){ //若有字母，输NO
			   System.out.print("NO");
			   break;
		   }
		   else if(arry[i] == '.'){
			   num++;
		   }
	   }
	   if(num == 3){    //不是3个。输出NO
	   String[] arry1 = str.split("\\.");  //Ip以。分割
	   for(int i = 0;i < arry1.length;i++){
		   if(arry1[i] == null){
			   System.out.print("NO");
		   } 
		   else if(Integer.valueOf(arry1[i]) > 0 && Integer.valueOf(arry1[i]) < 255){  //字符在0到255之间
			   count++;
		   }
	   }
   if(count == 4){   //如果四个数都是正常，则YES
		  System.out.print("YES");
	   }
   else if(count != 4){
	   System.out.print("NO");
   }
}
	   sc.close();
}
}
