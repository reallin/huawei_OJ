package Main;
/*
 * 将字符串按ASCII大小进行排序
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   if(str.length()>1024){
		   System.out.print("超出范围");
	   }
	   else{
	   char[] arry = str.toCharArray();
	   Arrays.sort(arry);
	   System.out.print(String.valueOf(arry));
	   }
	   sc.close();
}
}
